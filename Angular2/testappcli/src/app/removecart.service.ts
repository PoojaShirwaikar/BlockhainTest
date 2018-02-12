import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Subject} from 'rxjs/Subject';
import {Observable} from 'rxjs/Observable'

@Injectable()
export class removecartService {
    namesubj:Subject<any> = new Subject<any>();
    
    constructor(){
        
        }
        setfromcart(prd:any){
            this.namesubj.next(prd);
            
            }
            
            getfromcart():Observable<any>{
            return this.namesubj.asObservable();
            }
}