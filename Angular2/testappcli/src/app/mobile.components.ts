import {Component} from '@angular/core'
import {product} from './product'
import {ProductService1} from './product.service'
import {ProductService2} from './product2.service'
import {productservicess} from './productservice.service'

@Component({
    selector:'mobileproducts',
    template:`
                

    <table border="1">
        <tr *ngFor="let product of mobileproducts; let i=index;">
        <td>{{product.id}}</td>
        <td>{{product.name}}</td>
        <td>{{product.dec}}</td>
        <td>{{product.price}}</td>
        <td>{{product.qty}}</td>
        <td><img [src]="product.imgpath"/></td>
        </tr>   
    </table>  

    `    
     //view
})
export class mobileComponent{
    mobileproducts: product[];
    constructor(private productService:productservicess){
        console.log("mobile consructor")
        
        this.mobileproducts=productService.getProduct().filter(function(value:product)
    {
        return value.dec==='mobile';
    });
     
    }

    
}
