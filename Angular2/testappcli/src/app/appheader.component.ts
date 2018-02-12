import { Component, OnInit } from '@angular/core';
import {loginService} from './loginservice.service'
@Component({
    selector: 'appheader',
   template:`
<h2>welcome {{username}}</h2>
   
   `
})
export class appheaderComponent
 {
     username:string;//fetch from login
    
constructor(private loginservice:loginService){
    this.loginservice.getUser().subscribe(
       newname=>{
           //called when new value emitted
           this.username=newname.name;
        } );
    }


}