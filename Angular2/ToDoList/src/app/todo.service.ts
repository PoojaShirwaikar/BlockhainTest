import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {product} from './product'
import {Observable} from 'rxjs/Observable'
@Injectable()
export class todoService {
  product2: Array<product>;
    //injecting a service within a service
    constructor(private http:HttpClient){
      this.product2 = new Array<product>();
      console.log("todo  service consructor")
      let prod1 = new product("js",false,new Date(2017,1,12),new Date(2017,5,18));
      let prod2 =  new product("jquery",false,new Date(2017,2,12),new Date(2017,6,18));
      let prod3 =  new product("angular",false,new Date(2017,3,12),new Date(2017,7,18));
     this.product2.push(prod1);
      this.product2.push(prod2);
     this.product2.push(prod3);
      this.http.post("https://jsonplaceholder.typicode.com/todos",this.product2).subscribe();


      
      // this.http.post("https://jsonplaceholder.typicode.com/todos",{
      //   "userId": 11,
      //   "id": 201,
      //   "title": "new",
      //   "completed": false
      // }).subscribe();
      
    }
    getlist():Observable<any>{
       return this.http.get("https://jsonplaceholder.typicode.com/todos");
    }
}