import requests as _requests
from hashlib import blake2s as _blake2s
from time import time as _time

class DSGraderClient:
  def __init__(self, endpoint, userToken):
    self._endpoint = endpoint
    self._userToken = userToken
    print("DSGraderClient:", _requests.get(self._endpoint+'ping').text)
    print("[SERVER]", self.reqMessage())

  def proofOfWork(self, challstr, complexity = 20, timeoutsec = 180):
    TIMEOUT = _time() + timeoutsec
    nonce = 0
    while _time() < TIMEOUT:
      hashout = _blake2s(bytes(challstr + str(nonce), 'utf-8')).digest()
      if sum(hashout[:complexity//8]) + (hashout[complexity//8] >> (8 - complexity%8)) == 0:
        return nonce, hashout
      nonce += 1
    return "TIMEOUT: proofOfWork()"

  def reqChallenge(self):
    packet = { "userToken": self._userToken }
    try:
      return _requests.get(self._endpoint+'proofofworkrequest', params=packet).json()
    except:
      print('Error requesting ProofOfWork challenge')

  def reqMessage(self):
    try:
      return _requests.get(self._endpoint+'motd').text
    except:
      print('Error requesting ProofOfWork MOTD')

  def findProofOfWork(self):
    challenge = self.reqChallenge()
    print('ProofOfWork Challenge => ', (challenge['chalstr'], challenge['complexity']))
    answer, hashout = self.proofOfWork(challenge['chalstr'], challenge['complexity'])
    print('ProofOfWork Answer Found! => ', answer)
    return answer

  def submitFile(self, file):
    packet = {
      "userToken": self._userToken,
      "answer": self.findProofOfWork()
    }
    try:
      return _requests.post(self._endpoint+'proofofworkupload', files={'uploadedFile':open(file, 'rb')}, data=packet).text
    except:
      print('Error submitting file')

# USAGE
#
# import pyctfsglib as ctfsg
# grader = ctfsg.DSGraderClient("GRADER_URL", "USER_TOKEN")
# grader.submitFile("PATH_TO_FILE")
