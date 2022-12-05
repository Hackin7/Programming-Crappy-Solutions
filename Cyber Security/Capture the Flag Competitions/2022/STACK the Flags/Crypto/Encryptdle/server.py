import os
from typing import List
from cryptography.hazmat.primitives import padding
from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
from fastapi import FastAPI, Query
from fastapi.staticfiles import StaticFiles
from pydantic import BaseModel
import uvicorn

try:
    with open('flag.txt', 'rb') as f:
        FLAG = f.read()
except:
    FLAG = b'FLAGFLAGFLAGFLAGFLAGFLAGFLAGFLAG'

KEY = os.urandom(32)
IV = os.urandom(16)
MAX_LEN = 32

def pad(bstring):
    return (bstring + FLAG + b'\x00' * MAX_LEN)[:MAX_LEN]


def encrypt(bstring):
    padded_data = pad(bstring)
    cipher = Cipher(algorithms.Camellia(KEY), modes.CBC(IV))
    encryptor = cipher.encryptor()
    return encryptor.update(padded_data) + encryptor.finalize()


ANSWER = encrypt(FLAG).hex().upper()


# correct, present, absent
def judge(guess, answer):
    ALPHABET = '0123456789ABCDEF'
    result = [{'letter': c, 'presence': 'absent'} for c in guess]
    count = [0 for i in range(len(ALPHABET))]
    for c in answer:
        count[int(c, 16)] += 1
    for i in range(len(guess)):
        if(guess[i] == answer[i]):
            result[i]['presence'] = 'correct'
            count[int(guess[i], 16)] -= 1
    for i in range(len(guess)):
        if(result[i]['presence'] == 'correct'):
            continue
        if(count[int(guess[i], 16)] > 0):
            result[i]['presence'] = 'present'
            count[int(guess[i], 16)] -= 1
    return result


app = FastAPI()


class LetterResult(BaseModel):
    letter: str
    presence: str


@app.post("/api/compare", response_model=List[LetterResult])
async def compare(guess: str = Query(..., min_length=1, max_length=MAX_LEN)):
    enc_guess = encrypt(guess.encode()).hex().upper()
    return judge(enc_guess, ANSWER)


@app.get("/api/ping")
async def ping():
    return "pong"


app.mount("/", StaticFiles(directory="frontend/dist/", html=True), name="static")

if __name__ == '__main__':
    uvicorn.run(app, host='127.0.0.1', port=80)
