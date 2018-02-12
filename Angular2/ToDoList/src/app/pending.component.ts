import { Component, OnInit } from '@angular/core';
import {product} from './product'
import {todoService} from './todo.service'
import {Observable} from 'rxjs/Observable'
@Component({
    selector: 'pending',
    template:` 
    <table border="1">
    <tr *ngFor="let product of retrivedproducts; let i=index;">
    <td>{{product.title}}</td>
    <td>{{product.completed}}</td>
    <td>{{product.edate}}</td>
    <td>{{product.dueDate}}</td>
    <td><input type="checkbox" (change)="changedone(i)"/></td>
    <td><button (click)="remove(i)">Delete</button></td>
    </tr>   
 </table> 
    `
})
export class pendingComponent implements OnInit {
    pendingproducts: product[]=[];
    retrivedproducts: product[]=[];
    item:string;
    
    constructor(private todoService:todoService){
        console.log("pending consructor")
        
       
     
     
    }



    ngOnInit() {

        this.todoService.getlist().subscribe(data=>{
        this.pendingproducts=data;
        this.pendingproducts.forEach(element => {
                if(element.completed===false)
                {
                    this.retrivedproducts.push(element);
                }
                
            });
        });
     }

     remove(index:number):void{
        this.pendingproducts.splice(index,1);
     }

   
    addItem(a:string):void{
        this.item=a;
        let obj= new product(a,false,new Date(2017,5,7), new Date(2017,5,9));
        this.pendingproducts.push(obj);
    }

    changedone(index:number):void{
        if(this.pendingproducts[index].completed==false)
        this.pendingproducts[index].completed=true;
        else if(this.pendingproducts[index].completed==true)
        this.pendingproducts[index].completed=false;
    }


}