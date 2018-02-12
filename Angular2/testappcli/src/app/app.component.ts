import { Component } from '@angular/core';
import {beanComponent} from './user'
import {loginService} from './loginservice.service'
import {cartService} from './cart.service'
import {removecartService} from './removecart.service'
import {SignUpFormComponent} from './signupform.component'
@Component({
  selector: 'app-root',
  
  template:`
  <!--<h1> name in app component {{name}}</h1>
  <profile [user2]="name" (update)="handleupdate($event)"></profile>
  <appheader></appheader>
  <login></login>
  <pictures></pictures>
  <product></product>
  <cart></cart>
  <menu></menu>
  <router-outlet></router-outlet>
  <userform></userform>-->

<welcome></welcome>
 
  `,
  providers:[loginService,cartService,removecartService]
})
export class AppComponent {
  title = 'app';
name="jane";
  // user1=new beanComponent("xxx",25);

  handleupdate(neval:string):void{
    // this.user1.name=neval;
    this.name=neval;
  }
}
