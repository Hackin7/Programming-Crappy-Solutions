'use strict';
const bcrypt = require('bcryptjs');

var generatePassword = require('../helpers/generatePassword');

module.exports = {
  up: async (queryInterface, Sequelize) => {
    await queryInterface.bulkInsert('Users', [{
      username: 'bob_minion',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }, {
      username: 'kevin_minion',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }, {
      username: 'stuart_minion',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }, {
      username: 'gru_felonius',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }], {});
  },

  down: async (queryInterface, Sequelize) => {
  }
};
