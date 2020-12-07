const crypto = require('crypto');

const PATTERN = /[ -~]/

function getRandomByte() {
  var result = new Uint8Array(1);
  crypto.randomFillSync(result);
  return result[0];
}

function generatePassword(length) {
  return Array.apply(null, { 'length': length })
    .map(function () {
      var result;
      while (true) {
        result = String.fromCharCode(getRandomByte());
        if (PATTERN.test(result)) {
          return result;
        }
      }
    }, this)
    .join('');
}

module.exports = generatePassword