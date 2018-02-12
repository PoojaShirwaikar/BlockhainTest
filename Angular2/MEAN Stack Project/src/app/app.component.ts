import { UserService } from './user.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  userlist:any;  //To store all users 
  constructor(private userservice:UserService){
      this.fetchUserData();
      
  }
  fetchUserData(){
    //Ajax GET request for '/api/users'
    //Components are never tied with data 
    this.userservice.getUsers().then(data=>{
      this.userlist = data;  //Handle the response;
    })
  }
  
  postForm(name,age,address){
   //Ajax POST request and send the data  
   this.userservice.adduser(name,age,address).then(data=>{
     console.log('user added');
     this.fetchUserData();
   })
  }
  
}
