var http=require("http");
var server= http.createServer((req,res)=>{
    console.log("server is running")
    res.writeHead(200,{"content-type":"http"});
    res.end("<h1>hello world</h1>");
})
server.listen(4000,(res,req)=>{
    console.log("server is running on port 4000");
})