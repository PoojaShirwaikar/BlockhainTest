import {product} from './product';
import {productservicess} from './productservice.service';
import {Injectable} from '@angular/core'
@Injectable()
export class ProductService2  extends productservicess{
    products: Array<product>;
    constructor(){
        super();
        console.log("product  service consructor")
        this.products=new Array<product>();
        let prod1 = new product(1,"motorola","mobile",15000,1,"assets/images/1.jpg");
        let prod3 = new product(3,"lenovo","laptop",15000,1,"assets/images/3.jpg");
        let prod4 = new product(4,"samsung","mobile",15000,1,"assets/images/2.jpg");
        this.products.push(prod1);
        this.products.push(prod3);
        this.products.push(prod4);
    }
    getProduct():Array<product>{
        return this.products;
    }

}