const express = require('express');
const serveIndex = require('serve-index');
const app = express();

app.use("/downloads", express.static("downloads"));

app.listen(3000);