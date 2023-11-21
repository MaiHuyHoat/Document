var data=require("../Models/data.js");
//1. list --> lấy danh sách sản phẩm, đơn hàng
var index=(req,res)=>{
    res.send(data)

}
//1. list --> lấy danh sách sản phẩm, đơn hàng  dựa vào tên sản phẩm , filter.
var filter=(req,res)=>{
    var name=req.params.name;

    var filter=data.products.data.items.filter(Element=>Element.name.toLowerCase().match(name.toLowerCase()));
    res.send(filter);
    
    
}
//2. detail --> lấy thông tin chi tiết của 1 sản phẩm, đơn hàng
var detail=(req,res)=>{
  var id= req.query.id;
  var find= data.products.data.items.find(Element=>Element.id==id);
  res.send(find);
}
//3. add --> thêm mới 1 sản phẩm
var add=(req,res)=>{
    var addPro={
        "id": req.body.id,
        "name": req.body.name,
        "description": req.body.description,
        "features": req.body.features,
        "price": req.body.price,
        "keywords": req.body.keywords,
        "url": req.body.url,
        "category":req.body.category,
        "subcategory": req.body.subcategory
      }
      data.products.data.items.push(addPro);
      res.send(data);
}
//
var delet=(req,res)=>{
   var id= req.body.id;
    data=data.products.data.items.filter(Element=>Element.id!=id);
   res.send(data);
}

module.exports={index,detail,filter,add,delet};