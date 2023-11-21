const express= require('express');
const router= express.Router();
const controller= require("../Controllers/UserController")
router.get("/",controller.getAll)
router.get("/List",controller.getAll);
router.get("/Add",controller.createG);
router.post("/Add",controller.createP)
router.get("/Delete",controller.Delete)
module.exports=router