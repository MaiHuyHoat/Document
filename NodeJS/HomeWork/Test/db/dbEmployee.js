var sqlite3 = require('sqlite3').verbose();
var dbName = './data.db';
var db = new sqlite3.Database(dbName, (err) => {
    if (err) {
        console.log("Connect failed");
        throw err;
    }
    else {
        var tbl = `CREATE TABLE IF NOT EXISTS employee   (
            emp_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
            emp_code TEXT NOT NULL UNIQUE,
            emp_name TEXT NOT NULL,
            depart_id INTEGER 
        )`;
        db.run(tbl, (err) => {
            if (err) {
                console.log("Create table failed.");
                throw err;
            }
            else {
              var ins= `INSERT INTO employee (emp_code,emp_name,depart_id) VALUES (?,?,?)`;
            //   db.run(ins,["E1","NGUYEN VAN A",1],(err)=>{
            //     if (err) throw err;
            //   })
            //   db.run(ins,['E2','NGUYEN VAN B',1],(err)=>{
            //     if (err) throw err;
            //   })
            }
        })
    }
})
module.exports=db;