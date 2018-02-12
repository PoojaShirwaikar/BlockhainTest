import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Subject} from 'rxjs/Subject';
import {Observable} from 'rxjs/Observable'

@Injectable()
export class cartService {
    namesubj:Subject<any> = new Subject<any>();
    
    constructor(){
        
        }
        setcart(prd:any){
            this.namesubj.next(prd);
            
            }
            
            getcart():Observable<any>{
            return this.namesubj.asObservable();
            }
 
}