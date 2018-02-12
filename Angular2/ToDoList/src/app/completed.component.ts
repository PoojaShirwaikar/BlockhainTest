import { Component, OnInit } from '@angular/core';
import {product} from './product'
import {todoService} from './todo.service'

@Component({
    selector: 'completed',
    template:` 
    <table border="1">
    <tr *ngFor="let product of retrivegproducts; let i=index;">
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
export class completeComponent implements OnInit {
    completedproducts: product[]=[];
    retrivegproducts: product[]=[];
    item:string;
    
    constructor(private todoService:todoService){
        console.log("completed consructor")
            
    }


    ngOnInit() {
        
        this.todoService.getlist().subscribe(data=>{
            this.completedproducts=data;
            this.completedproducts.forEach(element => {
                    if(element.completed===true)
                    {
                        this.retrivegproducts.push(element);
                    }
                    
                });
            });
         }

         remove(index:number):void{
            this.retrivegproducts.splice(index,1);
         }
    
       
        addItem(a:string):void{
            this.item=a;
            let obj= new product(a,false,new Date(2017,5,7), new Date(2017,5,9));
            this.retrivegproducts.push(obj);
        }
    
        changedone(index:number):void{
            if(this.retrivegproducts[index].completed==false)
            this.retrivegproducts[index].completed=true;
            else if(this.retrivegproducts[index].completed==true)
            this.retrivegproducts[index].completed=false;
        }         

    }
