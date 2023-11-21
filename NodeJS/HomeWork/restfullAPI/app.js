var http= require('http');
var express= require('express');
var app= express();

var product=require('./Routes/product.js');
http.createServer(app).listen(3000,()=>{
    console.log('Server is running on port :3000');
    console.log("http://localhost:3000/");
})
app.use(express.urlencoded({extended:true}));
app.get('/',(req,res)=>{
    res.send("This is Restfull API homepage");
})
app.use('/product',product);
