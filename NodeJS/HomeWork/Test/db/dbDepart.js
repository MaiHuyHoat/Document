var sqlite3 = require('sqlite3').verbose();
var dbName = './data.db';
var db = new sqlite3.Database(dbName, (err) => {
    if (err) {
        console.log("Connect failed");
        throw err;
    }
    else {
        var tbl = `CREATE TABLE IF NOT EXISTS department   (
            depart_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
            depart_code TEXT NOT NULL UNIQUE,
            depart_name TEXT NOT NULL,
            total_emp INTEGER 
        )`;
        db.run(tbl, (err) => {
            if (err) {
                console.log("Create table failed.");
                throw err;
            }
            else {
              var ins= `INSERT INTO department(depart_code ,depart_name ,total_emp ) VALUES (?,?,?)`;
            //   db.run(ins,[" P1","Room 1",2],(err)=>{
            //     if (err) throw err;
            //   })
            //   db.run(ins,['P2','Room 2',0],(err)=>{
            //     if (err) throw err;
            //   })
            }
        })
    }
})
module.exports=db;