import { Component } from '@angular/core';
import {product} from './product';
import {loginService} from './loginservice.service';
import {todoService} from './todo.service';

@Component({
  selector: 'app-root',
  template: `
<!--<product></product>
<todo [itemobj]="obj"></todo>-->

<menu></menu>
<router-outlet></router-outlet> 
`,
providers:[loginService,todoService]
})
export class AppComponent {
  obj=new product("motorola",false,new Date(2017,5,12),new Date(2017,6,18));
;  
}
