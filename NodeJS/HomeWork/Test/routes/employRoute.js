var express= require('express');
var router= express.Router();
 var employeeController= require("../controllers/employeecontroller");
//list
router.get('/list',employeeController.list);
router.get('/list/filter',employeeController.list);
// detail
router.get('/detail/:emp_id',employeeController.detail)
// add
router.post("/add",employeeController.add)
// edit
router.post('/edit' ,employeeController.edit)
// delete
router.delete("/delete",employeeController.del);
module.exports=router;