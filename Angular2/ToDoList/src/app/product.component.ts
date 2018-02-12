import {Component, OnInit} from '@angular/core'
import {product} from './product'
import {ProductService} from './productservice.service'
import {todoService} from './todo.service'
import {ActivatedRoute} from '@angular/router';

@Component({
    selector:'product',
    template:`
<br><br>
<!--<nav class="navbar navbar-default">
<ul  class="nav nav-pills">
<li><a routerLink="todosummary">todosummary<a></li>
<li><a routerLink="pending">pending<a></li>
<li><a routerLink="completed">completed<a></li>
 <li><a routerLink="profile">profile<a></li>
</ul>
</nav>-->
  <h1>welcome {{name1}}</h1>
  
  <a routerLink="pending">pending</a><br>
  <a  routerLink="completed">completed</a><br>
  <a  routerLink="todosummary">todosummary</a><br>
  <a  routerLink="profile">profile</a><br>
  <router-outlet></router-outlet>

               <input type="text" #inputbox (keyup.enter)="addItem(inputbox.value)"> {{inputbox.value}}
                
                    <table border="1">
                        <tr *ngFor="let product of products; let i=index;">
                        <td>{{product.title}}</td>
                        <td>{{product.completed}}</td>
                        <td>{{product.edate}}</td>
                        <td>{{product.dueDate}}</td>
                        <td><input type="checkbox" (change)="changedone(i)"/></td>
                        <td><button (click)="remove(i)">Delete</button></td>
                        </tr>     
                    </table> 
                 
                 

                    
    `,
    providers:[{provide:ProductService, useClass:ProductService},
        {provide:todoService, useClass:todoService}]      

     //view
})
export class productComponent implements OnInit{

     products: Array<product>;
     name1:string;
     item:string;
     entered:boolean=false;
    constructor(private productService:ProductService,private todoservice:todoService,private activateRoute:ActivatedRoute){
        console.log("product consructor")
        // this.products=productService.getProduct();
     
  
    }

    ngOnInit() { 

        this.activateRoute.params.subscribe(routeParams=>{
            
             this.name1=routeParams['list'];
           

        });
        
                this.todoservice.getlist().subscribe(
                data=>{this.products=data;}
        
        
                )
            }

    remove(index:number):void{
        this.products.splice(index,1);
     }

    //     console.log(searchstr);
    // }

    addItem(a:string):void{
        this.item=a;
        let obj= new product(a,false,new Date(2017,5,7), new Date(2017,5,9));
        this.products.push(obj);
    }

    changedone(index:number):void{
        if(this.products[index].completed==false)
        this.products[index].completed=true;
        else if(this.products[index].completed==true)
        this.products[index].completed=false;
    }
}
