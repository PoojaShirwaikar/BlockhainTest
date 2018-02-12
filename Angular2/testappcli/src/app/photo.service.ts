import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {photo} from './photo';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';

@Injectable()
export class photoService {
    //injecting a service within a service
    constructor(private http:HttpClient){
    
    }
    getphotos():Promise<any>{
      return this.http.get("https://jsonplaceholder.typicode.com/photos").toPromise();
    }
}