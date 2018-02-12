import {product} from './product';
import {Injectable} from '@angular/core'
@Injectable()
export class ProductService {
    products: Array<product>;
    constructor(){
     
        console.log("product  service consructor")
      
        this.products=new Array<product>();
        let prod1 = new product("motorola",false,new Date(2017,1,12),new Date(2017,1,18));
         let prod2 =  new product("motorola",false,new Date(2017,1,12),new Date(2017,1,18));
         let prod3 =  new product("motorola",false,new Date(2017,1,12),new Date(2017,1,18));
        this.products.push(prod1);
         this.products.push(prod2);
        this.products.push(prod3);
    }
    getProduct():Array<product>{
        return this.products;
    }

}