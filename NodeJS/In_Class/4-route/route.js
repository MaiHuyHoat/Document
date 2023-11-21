var http= require('http');

var server=http.createServer((req,res)=>{
    console.log("server created and is running");
    var data='';

    switch (req.url) {
        case '/admin':
            {
                res.writeHead(200,{"content-type": "text/html"});
              data="admin page..";
              res.end(data);
            break;
            }
            case '/student':{
                res.writeHead(200,{"content-type": "application/json"});
                data=  {
                   id:1,
                   Name:'Nguyen van a',
                   age:20,
                   address:"ha noi",
               }
               res.end(JSON.stringify(data));
               break;
            }
                
        default:
           {
            res.writeHead(200,{"content-type": "text/html"});
            data="Hello node js...";
            res.end(data);
            break;
           }
    }
  
    
});
server.listen(8080,()=>{
console.log("server is running");
console.log("http://localhost:8080/");
})
// text/plain
//text/html
// application/json

