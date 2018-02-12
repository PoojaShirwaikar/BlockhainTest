import { Component, OnInit,Input } from '@angular/core';
import {productComponent} from './product.component';
import {loginService} from './loginservice.service';
import {beanComponent} from './user'
import {Router} from '@angular/router'
import {ActivatedRoute} from '@angular/router';

@Component({
    selector: 'todo',
    template:`
    <!--<ul>
        <li>{{itemobj.title}}</li>
        <li>{{itemobj.completed}}</li>
        <li>{{itemobj.edate}}</li>
        <li>{{itemobj.dueDate}}</li>
    </ul>-->
  
    `
})
export class todoComponent implements OnInit  {
 @Input()
//itemobj=todoComponent;
name1:string;
 itemobj:beanComponent;
    constructor(private loginservice:loginService) { 
        
    
    }

    ngOnInit() { 

     
    }
}