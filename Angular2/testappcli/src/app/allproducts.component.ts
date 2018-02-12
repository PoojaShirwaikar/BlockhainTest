import { Component, OnInit } from '@angular/core';
import {product} from './product'
import {ProductService1} from './product.service'
import {ProductService2} from './product2.service'
import {productservicess} from './productservice.service'
import {loginService} from './loginservice.service'
import {cartService} from './cart.service';
import {removecartService} from './removecart.service';
@Component({
    selector: 'allproducts',
    template:`
    <table border="1">
    <tr *ngFor="let product of products; let i=index;">
    <td>{{product.id}}</td>
    <td><a [routerLink]="['productdetails',product.id]">{{product.name}}</a></td>
    <td>{{product.dec}}</td>
    <td>{{product.price}}</td>
    <td>{{product.qty}}</td>
    <td><img [src]="product.imgpath"/></td>
    <td *ngIf="isAdmin"><button (click)="remove(i)">Delete</button></td>
    <td><button [disabled]="!isAdmin">edit</button></td>
    <td><button (click)="addtocart(product)" (click)="remove(i)">add to cart</button></td>
    
    </tr>   
</table>
<router-outlet></router-outlet>

    `
})
export class allproductsComponent  {
    products: Array<product>;
    isAdmin:boolean;
    constructor(productService:productservicess,private loginservice:loginService, private cartservice:cartService, private removeservice:removecartService){
        console.log("product consructor")
        
        this.products=productService.getProduct();
         this.loginservice.getUser().subscribe(
        newname=>{
        //     //called when new value emitted
        this.isAdmin=newname.role;
          } );

       
          this.removeservice.getfromcart().subscribe(
              data=>{this.products.push(data);});

    }

   


    remove(index:number):void{
        this.products.splice(index,1);
    }

    validate(searchstr:string):void{
        console.log(searchstr);
    }

    addtocart(producttocart:product):void
    {
        this.cartservice.setcart(producttocart);
    }
}