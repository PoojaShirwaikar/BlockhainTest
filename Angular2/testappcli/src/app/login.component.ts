import {Component} from '@angular/core'
import {loginService} from './loginservice.service'
import {beanComponent} from './user'
import {Router} from '@angular/router'
@Component({
    selector:'login',
    template:`
                <h3> login component</h3>
                <br>                
                <form>
                <label for="Name">Name:</label>
                <input type="text" name="n1" #newname [(ngModel)]="name" > 
                <label for="pwd">Password:</label>
                <input type="password">
                <button type="submit" (click)="login()" >Submit</button>
                <br> Value of name in class: {{name}} <br>
                Value of name in class: {{newname.value}}
                </form>        
    `
     //view
})
export class logincomponent{
   name:string="admin";
   password:string="password";
isadmin:boolean=true;
constructor(private loginservice:loginService, private router:Router){

}

login():void{
    console.log("success");
//    let  user1= new beanComponent(this.name,this.password,this.isadmin);
   let  user1= new beanComponent("admin","admin",this.isadmin);
   
    this.loginservice.setUser(user1);
    this.router.navigate(['/product']);
}
}
