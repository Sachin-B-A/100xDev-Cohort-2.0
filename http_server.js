//We are writing http server here using lib called express
const express = require("express");
const bodyParser = require("body-parser");
const headParser = require("head-parser");
const app = express();
const port = Process env.PORT
//
//or
// const port= process.env.PORT

app.use(bodyParser.json());
// app.use(headParser.json);
//res gives to function json and senf to respond to req.
app.get("/conversations", (req, res) => {
    console.log(req.body);// We have to use bodyparser to work this out
    console.log(req.headers);
    console.log(req.headers["Authorization"]);
    res.send({
        Name: "Sachin",
        age:20
    });
});

app.listen(port, function () {
  console.log(`Example app listening on port ${port}`);
});
