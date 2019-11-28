//create the object of xml http request
var xhr= new XMLHttpRequest();
xhr.open('GET','http://localhost:9093/employees',true);
xhr.responseType='text';
xhr.send();

xhr.onload = function()
{
   // alert("it works"+xhr.status);
    if(xhr.status==200)

    {
       var data=JSON.parse(xhr.responseText);
     
     var myString =" <table>";
     for(var i=0;i<data.length;i++){
        myString += "<tr>";
        myString += "<td>"+data[i].employeeId+"</td>";
        myString += "<td>"+data[i].employeeName+"</td>";
        myString += "<td>"+data[i].employeeSalary+"</td>";

        myString += "</tr>"; 
     }
     myString+="</table>";
        
     
        //for(i=0;i<data.presidents.length;i++)
       // {
        //    var x=i+1;
        //    myString += "President "+x+" was";
        //    myString += data.presidents[i].first+" ";
         //   myString += data.presidents[i].last+"<br/> "
       // }
        document.getElementById("container").innerHTML= myString;
    }
}


