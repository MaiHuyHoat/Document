
var sqlite3 = require("sqlite3")
var dbName = './demo.db';
// OPEN_CREATE: kiem tra dbName da co hay chua: chua co thi se tao moi
// OPEN_READWRITE: cho phep mo file dbName va doc ghi du lieu
// OPEN_READONLY: cho phep mo file dbName va chi duoc do du lieu
var db = new sqlite3.Database(dbName, (err) => {
    if (err) {
        console.log(err);
        return;
    }
    console.log("Connect to Database success. ");
    createTables();

   
    // updataData(2,'Mai Huy Hoat', 18, "Nam Định");
    deleteData(6);
    selectData();
})
// Create Tables 
var createTables = () => {
    var newtblQuery = ' CREATE TABLE IF NOT EXISTS Students(  Id INTEGER PRIMARY KEY AUTOINCREMENT NOT null,  Name TEXT NOT null,  Age INTEGER,   Address TEXT )';
      db.run(newtblQuery,(rs,err)=>{
        if (err) {
            console.log(err);
            return;
        }
        console.log("Create tabel database successfully. ");
      })

}
var insertData=()=>{
    var query=` INSERT INTO Students(Name,Age,Address) VALUES(?,?,?)`;
    db.run(query,['Nguyen thị Mị',20,"Hà nội"],(err)=>{
        if (err) {
            console.log(err);
            return;
        }
        console.log("Insert Data successfully. ");
    })
}
// db.run: thuc thi 1 cau query ko nhan lai gia tri (tao bang, them, sua , xoa )
// db.all:Lay toan bo du lieu theo cau query va tra ve allrow ve callback function
// db.each: lay toan bo du lieu theo cau query va tra tung row ve callbak funtion.
// db.get : lay 1 row va tra ve callback funciton
var selectData=()=>{
    var sql=` SELECT * FROM Students `;
    db.each(sql,(err,row)=>{
        if (err) {
            console.log(err);
            return;
        }

        console.log(`${row.Id}-${row.Name} - ${row.Age}- ${row.Address}`);


    })
}
var updataData=(id, name, age, address)=>{
 var sql=` UPDATE Students SET Name = ? , Age = ? , Address = ? 
 WHERE Id = ? `
 db.run(sql, [name,age, address,id],(err)=>{
    if(err){
        console.log(err);
        return;
    }
    console.log('update data success')
 })
}
var deleteData=(id)=>{
    var sql=` DELETE FROM Students WHERE id =?`;
    db.run(sql, [id],(err)=>{
       if(err){
           console.log(err);
           return;
       }
       console.log(`Delete student have id =${id} data success`);
    })
   }
