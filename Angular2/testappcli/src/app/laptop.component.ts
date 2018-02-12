import { Component, OnInit } from '@angular/core';
import {productservicess} from './productservice.service'
import {product} from './product'

@Component({
    selector: 'laptop',
   template:`
   
   <table border="1">
   <tr *ngFor="let product of laptopproducts; let i=index;">
   <td>{{product.id}}</td>
   <td>{{product.name}}</td>
   <td>{{product.dec}}</td>
   <td>{{product.price}}</td>
   <td>{{product.qty}}</td>
   <td><img [src]="product.imgpath"/></td>
   </tr>   
</table>  `
})
export class laptopComponent implements OnInit {
    laptopproducts: product[];
    
    constructor(private productService:productservicess){
        console.log("laptop consructor")
        
        this.laptopproducts=productService.getProduct().filter(function(value:product)
    {
        return value.dec==='laptop';
    });
     
    }


    ngOnInit() { }
}