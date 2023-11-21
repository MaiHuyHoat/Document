var http= require('http');
var fs=require('fs');
var data=fs.readFileSync('TestLab1_external.html','utf-8');
var server=http.createServer((req,res)=>{
    console.log("server created");
    res.writeHead(200,{"content-type": "text/html"});
    res.end(data);
    
});
server.listen(8080,()=>{
console.log("server is running");
console.log("http://localhost:8080/");
})
// text/plain
//text/html
// application/json

