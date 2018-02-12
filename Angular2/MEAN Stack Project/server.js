// Get dependencies
const express = require('express'); //NPM module
const path = require('path');
const http = require('http');
const bodyParser = require('body-parser');//NPM module
const mongoose = require('mongoose');   //NPM module
// Get our API routes
const api = require('./server/routes/api');

const app = express();

mongoose.connect('mongodb://localhost:27017/test_users');
// Parsers for POST data
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

// Point static path to dist
app.use(express.static(path.join(__dirname, 'dist')));

//Route handler 
app.get('/',function(req,res){
    //Route handler
    res.send('Default application page');
})

app.get('/home',function(req,res){
    //Route handler
    res.send('Welcome to my application');
})

// Set our api routes
app.use('/api', api);
//To handle all other routes of the app
app.get('*',function(req,res){
    res.sendFile(__dirname+'/dist/index.html'); //Load the shell page 
})

const port = 3000;
app.set('port', port);

/**
 * Create HTTP server.
 */
const server = http.createServer(app);

/**
 * Listen on provided port, on all network interfaces.
 */
server.listen(port, function(){
    console.log('API running on localhost:'+port);
});