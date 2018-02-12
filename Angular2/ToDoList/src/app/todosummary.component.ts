import { Component, OnInit } from '@angular/core';
import {todoService} from './todo.service'
import {product} from './product'
@Component({
    selector: 'summary',
    template:` 
   
    <h2>there are {{count}} entries</h2>`
})
export class summaryComponent implements OnInit {
    products:product[]=[];
    count:number=0;
    constructor(private todoservice:todoService) { }

    ngOnInit() {
        this.todoservice.getlist().subscribe(
            data=>{this.products=data;
                this.count=this.products.length;}
         
            );
         
     }
}