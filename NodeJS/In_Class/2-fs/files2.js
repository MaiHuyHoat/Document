var fs=require('fs');
// -----Blocking------
var data=fs.readFileSync('readMe.txt','utf-8');
console.log(data);
console.log('Blocking');
//-----------Non-blocking---------
var nData=fs.readFile('readMe.txt','utf-8',function(err,data){
    if(err)console.log(err);
    else{
        console.log(data);
    }
});
console.log('NOn-blocking')