var express= require('express');
var router= express.Router();
 var departController= require("../controllers/departcontroller");
//list
router.get('/list',departController.list);
// detail
router.get('/detail/:id',departController.detail)
// add
router.post("/add",departController.add)
// edit
router.post('/edit/:id' ,departController.edit)
// delete
router.delete("/delete/:id",departController.del);
module.exports=router;