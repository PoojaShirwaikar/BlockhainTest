import {Component} from '@angular/core'
import {loginService} from './loginservice.service'
import {beanComponent} from './user'
import {Router} from '@angular/router'

@Component({
    selector:'login',
    template:`
                <h3> login component</h3>
                <br>                
                
                <label for="Name">Name:</label>
                <input type="text" name="n1" #newname="ngModel" [(ngModel)]="name" required>
                <p *ngIf="newname.invalid">Name is a amandatory field</p>
                
                <label for="pwd" >Password:</label>
                <input type="password" name="pwd" #newpass="ngModel" [(ngModel)]="password" minlength="8"  required>
                <p *ngIf="newpass.errors?.minlength">phone should be atleast 8 char</p>
                <p *ngIf="newpass.errors?.required">phone is mandatory</p>

                <button type="submit" (click)="login()" > Submit</button>
                <br> Value of name in class: {{name}} 
                <br> Value of password in class: {{password}} 
                       
    `,
    styles:[
        ` input.ng-valid{
             border-left:solid green 2px;
         }
 
         input.ng-invalid{
             border-left:solid red 2px;
         }`
         ]
})
export class logincomponent{
   name:string;
   password:string;
isadmin:boolean=true;
constructor(private loginservice:loginService, private router:Router){

}

login():void{
    console.log("success");

    let  user1= new beanComponent(this.name,this.password,this.isadmin);
  // let  user1= new beanComponent("admin","admin",this.isadmin);
  console.log("before");
  
    console.log(user1.name);
    this.loginservice.setUser(user1);
    this.router.navigate(['todolist',this.name]);
    
    console.log("after");
    
}
}
