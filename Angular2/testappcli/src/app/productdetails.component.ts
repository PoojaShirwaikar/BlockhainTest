import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {product} from './product'
import {productservicess} from './productservice.service'

@Component({
    selector: 'pdetailscomponent',
    template:`
    <h2>product details </h2>
    <table border="1">
    <tr >
    <td>{{product.id}}</td>
    <td>{{product.name}}</td>
    <td>{{product.dec}}</td>
    <td>{{product.price}}</td>
    <td>{{product.qty}}</td>   
    </tr>   
    </table>
    
    `
})
export class ProductDetailsComponent implements OnInit {
    pId:number; //root parameter
    prd:Array<product>;
    product:product;
    constructor(productService:productservicess,private activateRoute:ActivatedRoute) { 
        this.prd=productService.getProduct();
    }

    ngOnInit() { 
        //fetch root parameter
    this.activateRoute.params.subscribe(routeParams=>{
        //handler will execute when params change
        //routeParams array of all root parameters
         this.pId=parseInt(routeParams['productId']);
         this.prd.forEach(element => {
             if(element.id===this.pId)
             {
                 this.product=element;
             }
         });

       // this.p=routeParams['productId'];
        

    });
    
    }
}