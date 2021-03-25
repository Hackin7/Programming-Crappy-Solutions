const express = require('express');
const bodyParser = require('body-parser');
const axios = require('axios');
const app = express();
const router = express.Router();
const COVID_SECRET = process.env.COVID_SECRET;
const COVID_BOT_ID_REGEX = /^[a-f0-9]{8}-[a-f0-9]{4}-4[a-f0-9]{3}-[89aAbB][a-f0-9]{3}-[a-f0-9]{12}$/g;
const Connection = require("./db-controller");
const dbController = new Connection();
const COVID_BACKEND = "web_challenge_5_dummy"

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

//Validates requests before we allow them to hit our endpoint
router.use("/register-covid-bot", (req, res, next) => {
  var invalidRequest = true;
  if (req.method === "GET") {
    if (req.query.COVID_SECRET && req.query.COVID_SECRET === COVID_SECRET) {
      invalidRequest = false;
    }
  } else {//Handle POST
    let covidBotID = req.headers['x-covid-bot']
    if (covidBotID && covidBotID.match(COVID_BOT_ID_REGEX)) {
      invalidRequest = false;
    }
  }

  if (invalidRequest) {
    res.status(404).send('Not found');
  } else {
    next();
  }

});

//registers UUID associated with covid bot to database
router.get("/register-covid-bot", (req, res) => {
  let { newID } = req.query;

  if (newID.match(COVID_BOT_ID_REGEX)) {
    //We enroll a maximum of 100 UUID at any time!!
    dbController.addBotID(newID).then(success => {
      res.send({
        "success": success
      });
    });
  }

});

//Change a known registered UUID
router.post("/register-covid-bot", (req, res) => {
  let payload = {
    url: COVID_BACKEND,
    oldBotID: req.headers['x-covid-bot'],
    ...req.body
  };
  if (payload.newBotID && payload.newBotID.match(COVID_BOT_ID_REGEX)) {
    dbController.changeBotID(payload.oldBotID, payload.newBotID).then(success => {
      if (success) {
        fetchResource(payload).then(httpResult => {
          res.send({ "success": success, "covid-bot-data": httpResult.data });
        })


      } else {
        res.send({ "success": success });
      }
    });
  } else {
    res.send({ "success": false });
  }

});

async function fetchResource(payload) {
  //TODO: fix dev routing at backend http://web_challenge_5_dummy/flag/42
  let result = await axios.get(`http://${payload.url}/${payload.newBotID}`).catch(err => { return { data: { "error": true } } });
  return result;
}

app.use("/", router); 
