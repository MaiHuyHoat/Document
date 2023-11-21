const http = require('http');
const express = require('express');

const app = express();
const port = 8080;

const empRoute = require('./Routes/empRoute');

http.createServer(app).listen(port, ()=>{
    console.log(`Server is running at http://localhost:${port}`);
});


app.get('/', (req, res)=>{
    res.end('Welcome back home');
})

// Routes
app.use('/emp', empRoute);
