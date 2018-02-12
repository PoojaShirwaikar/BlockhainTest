import { Component, OnInit } from '@angular/core';
import {product} from './product';
import {cartService} from './cart.service';
import {removecartService} from './removecart.service';
@Component({
    selector: 'cart',
    template:`
    <table border="1">
    <tr *ngFor="let c of cart; let i=index;">
    <td>{{c.id}}</td>
    <td>{{c.name}}</td>
    <td>{{c.dec}}</td>
    <td>{{c.price}}</td>
    <td>{{c.qty}}</td>
    <td><img [src]="c.imgpath"/></td>
    <td><button (click)="removecart(c)" (click)="remove(i)">remove from cart</button></td>
    
   
    </tr>   
</table>  


    `
})
export class cartComponent {
    cart:Array<product>;
    
    constructor(private cartservice:cartService, private removecartservice:removecartService) {
       this.cart=new Array<product>();
        this.cartservice.getcart().subscribe(
            data=>{this.cart.push(data);})
    
        }
        remove(index:number):void{
            this.cart.splice(index,1);
        }

        removecart(removefromcart:product):void
        {
            this.removecartservice.setfromcart(removefromcart);
        }
}