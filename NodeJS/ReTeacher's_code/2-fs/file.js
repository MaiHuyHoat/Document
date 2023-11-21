var fs=require("fs");
//1 create files;
fs.writeFileSync("note.txt","Hello My name is Hoat");
fs.appendFileSync("note2.txt","this is method appedn file");
//2 read file
var data=fs.readFileSync('note.txt','utf-8');
console.log(data);
//3 rename file
fs.renameSync('note2.txt','rename.txt');
// 4 delete file
fs.unlinkSync('rename.txt');
