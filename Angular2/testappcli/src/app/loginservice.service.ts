import { Injectable } from '@angular/core';
import {Subject} from 'rxjs/Subject';
import {Observable} from 'rxjs/Observable'
import {beanComponent} from './user'
@Injectable()
export class loginService {
namesubj:Subject<beanComponent> = new Subject<beanComponent>();
setUser(names:beanComponent){
this.namesubj.next(names);
}

getUser():Observable<beanComponent>{
return this.namesubj.asObservable();
}
}
