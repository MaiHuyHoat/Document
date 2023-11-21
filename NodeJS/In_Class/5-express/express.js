
const express = require('express')
const app = express()
const port = 4000
var http=require("http");
var data= require("./dataSample");


http.createServer(app);
app.get('/', (req, res) => {
  res.send("Express JS")
})
app.get("/emp/list",(req,res)=>{
    res.send(JSON.stringify(data));
})
app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
// su dung httpMethod Get la thong tin chi tiet 1 nhan vien
app.get("/emp/detail/:id",(req,res)=>{
    var id=parseInt(req.params.id);
    var detail=data.find(x=>x.Id==id);
    res.send(detail);

})
// truyền tham số vào query string
app.get('/emp/detail',(req,res)=>{
    //get params id
    var id=parseInt(req.query.id);
    var detail=data.find(x=>x.Id==id);
    res.send(detail);

})
// them moi du lieu
app.use(express.urlencoded({extended: true}));
app.post('/emp/add',(req,res)=>{
   var emp={
    Id:req.body.Id,
    Name: req.body.Name,
    Age: req.body.Age,
    Address: req.body.Address
   };
   data.push(emp);
   res.send(data);
})