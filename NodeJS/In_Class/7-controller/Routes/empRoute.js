const express = require('express');
const empRouter = express.Router();
const empController = require('../controllers/empController');

empRouter.get('/', empController.index)

empRouter.get('/list', empController.list)

empRouter.get('/detail/:id', empController.detail)

module.exports =  empRouter