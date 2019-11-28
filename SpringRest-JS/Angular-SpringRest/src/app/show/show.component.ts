import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-show',
  templateUrl: './show.component.html',
  styleUrls: ['./show.component.css']
})
export class ShowComponent implements OnInit {
 username:string;
 result:any;
  constructor(private http: HttpClient) {

   }

  ngOnInit() {
  }

  searchUser():void{
   alert('in search user function');
  this.http.get('http://localhost:9093/employees/'+this.username).subscribe((result)=>{
  //console.log('it works!'+result);
  this.result = result;
});
  }

}
