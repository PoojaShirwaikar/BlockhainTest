import {Component} from '@angular/core'
import { User } from './Users';
@Component({
    selector:'welcome',
    template:`
        <h1>{{welcomemessage | lowercase}}</h1>  
        currency  {{price | currency:"INR"}}<br>
        date {{today | date}}<br>
       medium  date {{today | date:"medium"}}<br>
        long date {{today | date:"longDate"}}<br>
        long date {{today | date:"mediumDate"}}<br>
        camelcase {{welcomemessage|camelcase}}<br>
        phone number {{phonenumber|phone}}
        
    ` 
    //json {{obj|json}}
     //view
})
export class welcomecomponent{
welcomemessage:string;
price:number=250;
today:Date=new Date();
phonenumber:number=1245678945;
//obj:User;
constructor(){
    this.welcomemessage="welcome to my application"; //module
//this.obj=new User("jane","11111","margao");
}
}