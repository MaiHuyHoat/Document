var index = (req, res)=>{
    res.send('emp index page')
};

var list = (req, res)=> {
    res.end('emp list page')
};

var detail = (req, res)=>{
    var id = req.params.id;
    res.end('emp detail page ' + id)
};

module.exports = {index, list, detail};