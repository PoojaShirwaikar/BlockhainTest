import {Component} from '@angular/core'
import {product} from './product'
import {ProductService1} from './product.service'
import {ProductService2} from './product2.service'
import {productservicess} from './productservice.service'
import {loginService} from './loginservice.service'
import {cartService} from './cart.service';
import {removecartService} from './removecart.service';
@Component({
    selector:'product',
    template:`
                <h1>PRODUCTS </h1>
           <!--     Search key: <input type="text" #search (keyup)="validate(search.value)">{{search.value}}
               
                    <table border="1">
                        <tr *ngFor="let product of products; let i=index;">
                        <td>{{product.id}}</td>
                        <td>{{product.name}}</td>
                        <td>{{product.dec}}</td>
                        <td>{{product.price}}</td>
                        <td>{{product.qty}}</td>
                        <td><img [src]="product.imgpath"/></td>
                        <td *ngIf="isAdmin"><button (click)="remove(i)">Delete</button></td>
                        <td><button [disabled]="!isAdmin">edit</button></td>
                        <td><button (click)="addtocart(product)" (click)="remove(i)">add to cart</button></td>
                        
                        </tr>   
                    </table>-->

                    <a routerLink="mobile">mobile</a><br><br>
                    <a  routerLink="laptop">laptop</a>
                    <router-outlet></router-outlet>

                    
    `,
    providers:[{provide:productservicess, useClass:ProductService2},
        {provide:productservicess, useClass:ProductService1},
       ]
     //view
})
export class productComponent{

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
            


     
        // this.products=new Array<product>();
        // let prod1 = new product(1,"motorola","mobile",15000,1,"assets/images/1.jpg");
        // let prod2 = new product(2,"sony","camera",10000,1,"assets/images/2.jpg");
        // let prod3 = new product(3,"motorola","mobile",15000,1,"assets/images/3.jpg");
        // let prod4 = new product(4,"motorola","mobile",15000,1,"assets/images/4.jpg");
        // let prod5 = new product(5,"motorola","mobile",15000,1,"assets/images/5.jpg");
        // this.products.push(prod1);
        // this.products.push(prod2);
        // this.products.push(prod3);
        // this.products.push(prod4);
        // this.products.push(prod5);
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
