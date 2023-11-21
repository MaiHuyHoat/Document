var db = require("../db/dbEmployee");



var list = (req, res) => {
    var list = `SELECT * FROM employee INNER JOIN department ON employee.depart_id=department.depart_id`;
    db.all(list, (err, rows) => {
        if (err) {
        res.status(400).json({message: err.message});
        } else {
            res.json({ message: 'Success', data: rows });
        }
    })
}
var filter=(req,res)=>{
     var emp_code=req.query.emp_code;
     var depart_id=req.query.depart_id;
    var list = `SELECT * FROM employee INNER JOIN department ON employee.depart_id=department.depart_id WHERE employee.emp_code =? AND employee.depart_id=? `;
    db.all(list,[emp_code,depart_id], (err, rows) => {
        if (err) {
        res.status(400).json({message: err.message});
        } else {
            res.json({ message: 'Success', data: rows });
        }
    })
}
var detail = (req, res) => {

    var detail = ` SELECT * FROM employee WHERE emp_id= ?`;

    var emp_id = req.params.emp_id;

    db.get(detail,[emp_id],(err,row)=>{
        if(err) {
            throw err;
        }else {
            res.json({message:'Success',data: row});
        }
    })

}
 var upDateTotal_mem=(depart_id)=>{
    var total_empSql=`SELECT COUNT(*) FROM employee WHERE employee.depart_id=?`;
    db.get(total_empSql,[depart_id],(err,row)=>{
        var total_emp=row['COUNT(*)'];
        total_emp;
        let sqldepart=`UPDATE department SET total_emp=? WHERE depart_id=?`
       db.run(sqldepart,[total_emp,depart_id])
    })
 }
var add = (req, res) => {
    var ins= `INSERT INTO employee (emp_code,emp_name,depart_id) VALUES (?,?,?)`;
    var emp_name=req.query.emp_name;
    var emp_code=req.query.emp_code;
    var depart_id= req.query.depart_id;

    db.run(ins,[emp_code,emp_name,depart_id]);
    var list = `SELECT * FROM employee INNER JOIN department ON employee.depart_id=department.depart_id;`;
    // hien thi danh sach sau khi them
    db.all(list, (err, rows) => {
        if (err) {
        res.status(400).json({message: err.message});
        } else {
            res.json({ message: 'Success', data: rows });
        }
    })
   upDateTotal_mem(depart_id);
    
   
}
var edit = (req, res) => {
    var emp_name=req.query.emp_name;
    var emp_code=req.query.emp_code;
    var depart_id= req.query.depart_id;
    var emp_id=req.query.emp_id;
    var sql=`UPDATE employee SET emp_code=? , emp_name=? , depart_id=? WHERE emp_id=?`;
    db.get(sql,[emp_code,emp_name,depart_id,emp_id],(err,row)=>{
        res.send("edit success");
    })
    upDateTotal_mem(depart_id);
}
var del = (req, res) => {
    var emp_id=req.query.emp_id;
    var sqlDepart_id=`SELECT depart_id FROM employee WHERE emp_id=?`;
    db.get(sqlDepart_id,[emp_id],(err,row)=>{
        var depart_id=row['depart_id'];
        var del=`DELETE FROM employee WHERE emp_id=? `;
        db.run(del,[emp_id]);
        upDateTotal_mem(depart_id);
        res.send("delete success")
    })


}
module.exports = { list, detail,filter, add, edit, del };