const conn = require("../Config/Connect");
var getAll = (req, res) => {
  var sql = "Select * from user";
  conn.query(sql, (err, rs) => {
    if (err) console.log(err);
    else {
      var data = {
        data: rs,
        content: "../Views/List",
      };
      res.render("../Views/Index", data);
    }
  });
};
//method Get Create

var createG = (req, res) => {
  var data = {
    data: {},
    content: "../Views/create",
  };
  res.render("../Views/Index", data);
};
//method post
var createP = (req, res) => {
  var sql = `INSERT INTO user (FirstName, LastName, Mobile, UserName, Password)
    VALUES
      (?, ?, ?, ?, ?)
    `;
  var firstname = req.body.firstName;dd
  var lastname = req.body.lastName;
  var mobile = req.body.mobile;
  var username = req.body.userName;
  var password = req.body.password;

  conn.query(
    sql,
    [firstname, lastname, mobile, username, password],
    (err, rs) => {
      if (err) console.log(err);
      else {
        // cap nhat lai du lieu va dieu huong ve trang index
        var sqlGetAll = "Select * from user";
        conn.query(sqlGetAll, (err, rs) => {
          if (err) console.log(err);
          else {
            var data = {
              data: rs,
              content: "../Views/List",
            };
            res.render("../Views/Index", data);
          }
        });
      }
    }
  );
};
var Delete = (req, res) => {
  var id = req.query.id;
  var sql = " delete from user where id=?";
  conn.query(sql, [id], (err, rs) => {
    if (err) console.log(err);
    else {
      // cap nhat lai du lieu va dieu huong ve trang index
      var sqlGetAll = "Select * from user";
      conn.query(sqlGetAll, (err, rs) => {
        if (err) console.log(err);
        else {
          var data = {
            data: rs,
            content: "../Views/List",
          };
          res.render("../Views/Index", data);
        }
      });
    }
  });
};
module.exports = { getAll, createG, createP, Delete };
