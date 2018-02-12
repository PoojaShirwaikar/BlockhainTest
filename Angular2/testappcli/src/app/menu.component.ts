import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'menu',
    template:`<nav class="navbar navbar-default">
    <ul class="nav nav-pills" >
     <li *ngFor="let item of menuitems;" >
     <a routerLink="{{item |lowercase}}">{{item}}</a></li>
   </ul>
 </nav>
   
  `
    

})
export class MenuComponent implements OnInit {
    menuitems:string[];
    constructor() {
        this.menuitems=["Welcome","Login","Product","Photo","pagenotfound"];
     }

    ngOnInit() { }
}