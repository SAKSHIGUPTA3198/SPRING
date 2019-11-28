function populateProducts(){

var e=document.getElementById("category");
var strCategory = e.options[e.selectedIndex].value;
var strOptions="";
var xhr= new XMLHttpRequest();
xhr.open('GET','products.json',true);
xhr.responseType='text';
xhr.send();

xhr.onload = function(){
    if(xhr.status==200)
    {
    var data=JSON.parse(xhr.responseText);

if(strCategory=="electronics"){
    for(i=0;i<data.electronics.length;i++){
        var temp="<option>"+data.electronics[i].productName+"</option>"
      strOptions= strOptions +temp;
    }
}


else if(strCategory=="grocery"){
    for(i=0;i<data.grocery.length;i++){
        var temp="<option>"+data.grocery[i].productName+"</option>"
      strOptions = strOptions + temp;
       
        
    }
}


document.getElementById("productName").innerHTML=strOptions;
//document.getElementById("").innerHTML=strOptions;

}
}
}
function calculateTotal(){
    alert("1");
}
