import { Component, OnInit } from '@angular/core';
import {beanComponent} from './user'
import {Router} from '@angular/router'
import {loginService} from './loginservice.service'


@Component({
    selector: 'profile',
    template:`
    <label for="Name">Updated Name:</label>
    <input type="text" #inputbox (keyup.enter)="update(inputbox.value)">
    <br> updated name: {{inputbox.value}} 
    `,
    styles:[
        ` input.ng-valid{
             border-left:solid green 2px;
         }
 
         input.ng-invalid{
             border-left:solid red 2px;
         }`
         ]
})
export class profileComponent implements OnInit {
//newname:string;
    constructor(private loginservice:loginService, private router:Router){}

    ngOnInit() { }

    update(newname:string):void{
            this.router.navigate(['todolist',newname]);          
    }
}