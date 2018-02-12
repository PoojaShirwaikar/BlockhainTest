import { Component, OnInit } from '@angular/core';
import {User} from './Users';
@Component({
    selector:'userform',
    templateUrl: 'signupform.component.html',
    styles:[
       ` input.ng-valid{
            border-left:solid green 2px;
        }

        input.ng-invalid{
            border-left:solid red 2px;
        }`
        ]
    
})
export class SignUpFormComponent  {
    user:User = {
            name : 'James',             
            phone:"1234",
            address:'India'
        
    }

    postForm():void{
        //http post req
        alert("posted form");
    }
 
}