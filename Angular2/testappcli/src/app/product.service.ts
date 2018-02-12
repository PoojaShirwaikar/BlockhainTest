import {product} from './product';
import {productservicess} from './productservice.service';
import {Injectable} from '@angular/core'
@Injectable()
export class ProductService1 extends productservicess{
    products: Array<product>;
    isAdmin:boolean=true;
    constructor(){
        super();
        console.log("product  service consructor")
        this.products=new Array<product>();
        let prod1 = new product(1,"motorola","mobile",15000,1,"assets/images/1.jpg");
        let prod2 = new product(2,"sony","camera",10000,1,"assets/images/4.jpg");
        let prod3 = new product(3,"lenovo","laptop",15000,1,"assets/images/3.jpg");
        let prod4 = new product(4,"samsung","mobile",15000,1,"assets/images/2.jpg");
        let prod5 = new product(5,"xiomi5","mobile",15000,1,"assets/images/5.jpg");
        this.products.push(prod1);
        this.products.push(prod2);
        this.products.push(prod3);
        this.products.push(prod4);
        this.products.push(prod5);
    }

    getProduct():Array<product>{
        return this.products;
    }

}