import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import 'rxjs/add/operator/toPromise';
@Injectable()
export class UserService {
    
    constructor(private http:HttpClient){

    }
    getUsers(){
     //Ajax GET request for '/api/users'
     return this.http.get('/api/users').toPromise();
     
    }
    adduser(name:string,age:number,address:string){
        //HTTP POST request to '/api/users'
        return this.http.post('/api/users',{name:name,age:age,address:address}).toPromise();
    }
}