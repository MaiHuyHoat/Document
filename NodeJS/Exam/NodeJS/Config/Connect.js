const mysql = require('mysql');
 
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'exam'
});
 
connection.connect((error) => {
  if (error) console.log(error)
  else{
    const sqlCreateTable = `CREATE TABLE IF NOT EXISTS user (
      id int primary key AUTO_INCREMENT,
      FirstName varchar(200), 
      LastName varchar(200),
      Mobile varchar(200), 
      UserName varchar(200),
      Password varchar(200)
    )`;
    
    const sqlInsertRandomData = `INSERT INTO user (FirstName, LastName, Mobile, UserName, Password)
    VALUES
      ('John', 'Doe', '123456789', 'johndoe', 'password123'),
      ('Jane', 'Smith', '987654321', 'janesmith', 'mypassword'),
      ('Michael', 'Johnson', '456789123', 'michaelj', 'securepassword'),
      ('Emily', 'Williams', '789123456', 'emilyw', 'strongpass123'),
      ('David', 'Brown', '654789123', 'davidbrown', 'myp@ssword')`;
    
    connection.query(sqlCreateTable, (err, rs) => {
      if (err) {
        console.log('Error creating table:', err);
      } else {
        console.log('Table created successfully');
    
        // connection.query(sqlInsertRandomData, (err, rs) => {
        //   if (err) {
        //     console.log('Error inserting data:', err);
        //   } else {
        //     console.log('Inserted random data successfully');
        //   }
        // });
      }
    });
  }
 
  
});
module.exports=connection;