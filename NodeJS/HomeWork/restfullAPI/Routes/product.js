var ctrl= require('../controller/ctrl_Product.js');
var express= require('express');
var proRouter=express.Router();
proRouter.get('/',ctrl.index)
proRouter.get('/filter/:name',ctrl.filter)
proRouter.get('/detail',ctrl.detail)
proRouter.post('/add',ctrl.add);
proRouter.post('/delete',ctrl.delet);
module.exports=proRouter;