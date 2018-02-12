import {Component} from '@angular/core'
@Component({
    selector:'welcome',
    template:`
        <h1>{{welcomemessage}}</h1>    
    ` 

     //view
})
export class welcomecomponent{
welcomemessage:string;
constructor(){
    this.welcomemessage="welcome to my application";
}
}