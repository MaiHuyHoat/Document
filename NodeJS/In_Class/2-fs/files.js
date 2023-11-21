var fs=require('fs');
//1 .Created file
fs.writeFileSync('note.txt','Hello NodeJS','utf-8');
console.log('file created');
//2 . ReadFiles
var data=fs.readFileSync('note.txt','utf-8');
console.log(data);
//3.Rename files
fs.renameSync('note.txt','readMe.txt');
//4. append data files
fs.appendFileSync('readMe.txt','- FAI FPT- APTECH','utf-8');
var newData=fs.readFileSync('readMe.txt','utf-8');
console.log(newData);
//5. delete file
// fs.unlinkSync('readMe.txt');
// console.log("file deleted");