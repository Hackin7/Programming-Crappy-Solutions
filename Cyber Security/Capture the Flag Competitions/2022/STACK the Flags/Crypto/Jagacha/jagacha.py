#!/usr/bin/env python3

import asyncio
import logging
import random

from config import (
    get_seed,
    FLAG,
    ASCII_JAGA,
    ASCII_JAGAHACKER,
    ASCII_JAGASCHOLAR,
    ASCII_JAGASUPER,
)

logger = logging.basicConfig(level=logging.INFO)

HOST = "127.0.0.1"
PORT = 8080


GACHAS = {
    "Jaga-chan": ASCII_JAGA,
    "Jaga Hacker": ASCII_JAGAHACKER,
    "Jaga Scholar": ASCII_JAGASCHOLAR,
    "Super Jaga": ASCII_JAGASUPER,
}
GACHA_KEYS = [*GACHAS.keys()]


async def print_menu(writer: asyncio.StreamWriter):
    writer.writelines(
        (
            b"Welcome to the Jaga Gacha!\n",
            b"We have an event going on featuring the limited SSS-rarity flag-chan!\n",
            b"Here are the Gacha pull rates:\n",
            *[f"- {v}: 25 %\n".encode() for v in GACHAS],
            b"- flag-chan: 0 %\n",
            b"All the best!\n",
            b"\n",
            b"Options:\n",
            b"1. Roll a Gacha\n",
            b"2. I'm Feeling Lucky!\n",
            b"3. Exit\n",
        )
    )
    await writer.drain()


async def read_number(
    reader: asyncio.StreamReader, writer: asyncio.StreamWriter, prompt=b"> "
):
    writer.write(prompt)
    await writer.drain()
    while not (line := await reader.readline()).rstrip().isdigit():
        writer.writelines((
            b"Input is not a valid number\n",
            prompt,
        ))
        await writer.drain()
    return int(line)


async def handler(reader: asyncio.StreamReader, writer: asyncio.StreamWriter):
    client_ip, client_port = reader._transport.get_extra_info('peername')
    logging.info(f"New connection from: {client_ip}:{client_port}")

    rand = random.Random(get_seed()) # set seed base on time
    try:
        option = None
        while option != 3:
            await print_menu(writer)

            option = await read_number(reader, writer)
            if option == 1: # gacha
                num = rand.getrandbits(64) # generate 'random' 64 bits, can be determined if have seed
                gacha = GACHA_KEYS[num % len(GACHA_KEYS)]
                writer.writelines(
                    (
                        f"Congrats! You have pulled a {gacha}!\n".encode(),
                        GACHAS[gacha],
                        b"Here are the stats of your character:\n",
                        f"STR: {num>>48 & 0xffff}\n".encode(), # convert 1st 16 bits to int
                        f"DEX: {num>>32 & 0xffff}\n".encode(), # convert 2nd 16 bits to int
                        f"INT: {num>>16 & 0xffff}\n".encode(), # convert 3rd 16 bits to int
                        f"LUK: {num & 0xffff}\n".encode(), # convert 4th 16 bits to int
                        b'\n', # combining all the bits together gives the 'random' 64 bits
                    )
                )
            elif option == 2: # enter lucky number to get flag, only method to get flag
                num = rand.getrandbits(64) # generate 'random' 64 bits, can be determined if have seed
                lucky_number = await read_number(
                    reader, writer, b"Enter your lucky number: "
                )
                if lucky_number == num: # if guess lucky number correctly, get flag and quit
                    writer.writelines((
                        b"Congrats! You have pulled the limited SSS-rated rarity flag-chan!\n",
                        FLAG,
                    ))
                    option = 3  # Quit
                else: # wrong guess, try again
                    writer.write(
                        b"Oops! Looks like you are not as lucky as you thought! Try again!\n\n"
                    )
            elif option == 3: # quit
                writer.write(b"See you again!\n")

            await writer.drain()
    finally:
        writer.write_eof()
        writer.close()


async def main(host, port):
    srv = await asyncio.start_server(handler, host, port)
    await srv.serve_forever()


if __name__ == "__main__":
    asyncio.run(main(HOST, PORT))
