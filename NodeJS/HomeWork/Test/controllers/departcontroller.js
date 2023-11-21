var db = require("../db/dbDepart");



var list = (req, res) => {
    var list = `SELECT * FROM department`;
    db.all(list, (err, rows) => {
        if (err) {
        res.status(400).json({message: err.message});
        } else {
            res.json({ message: 'Success', data: rows });
        }
    })
}

var detail = (req, res) => {
    var detail = ` SELECT * FROM department WHERE depart_id= ?`;
    var id = req.params.id;

    db.get(detail,[id],(err,row)=>{
        if(err) {
            throw err;
        }else {
            res.json({message:'Success',data: row});
        }
    })

}

var add = (req, res) => {
    var ins= `INSERT INTO department(depart_code ,depart_name ,total_emp ) VALUES (?,?,?)`;
    var depart_code= req.query.depart_code;
    var depart_name=req.query.depart_name;
    var total_emp=0;

    db.run(ins,[depart_code,depart_name,total_emp]);
    var list = `SELECT * FROM department `;
    // hien thi danh sach sau khi them
    db.all(list, (err, rows) => {
        if (err) {
        res.status(400).json({message: err.message});
        } else {
            res.json({ message: 'Success', data: rows });
        }
    })
}
var edit = (req, res) => {
    var sql=`UPDATE department SET depart_code=? , depart_name=? , total_emp=? WHERE depart_id=?`;
    db.get(sql,[depart_code,depart_name,total_emp,depart_id],(err,row)=>{
        res.send("edit success");
    })
}
var del = (res, req) => {
   var depart_id=req.query.depart_id;
    var sql1=`SELECT total_emp FROM department WHERE depart_id=?`;
    db.get(sql1,[depart_id],(err,row)=>{
        var total_emp= row['total_emp']
        if(total_emp>0){
            res.send("This depart can not delete ");
        }
        else {
            var del=`DELETE FROME department WHERE depart_id=?`;
            db.rung(del,[depart_id]);
            res.send("success deleete")
        }
    })
}
module.exports = { list, detail, add, edit, del };