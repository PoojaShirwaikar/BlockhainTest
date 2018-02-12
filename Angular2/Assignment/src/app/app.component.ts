import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
  
  <ul class="nav navbar-nav"  [ngSwitch]="true">
  
  <li *ngSwitchCase="isuser===1 ||isuser===3 ||isuser===2"><a href="#">Login</a></li>
  <li *ngSwitchCase="isuser===1 ||isuser===2"><a href="#">Products</a></li>
  <li *ngSwitchCase="isuser===1 ||isuser===2"><a href="#">Photos</a></li>
  <li *ngSwitchCase="isuser===1 ||isuser===2"><a href="#">Profile</a></li>
  <li *ngSwitchCase="isuser===1 ||isuser===3"><a href="#">SignUp</a></li>
  <li *ngSwitchCase="isuser===1"><a href="#" >Inventory</a></li>
  <li *ngSwitchCase="isuser===1"><a href="#">Reports</a></li>
  <li *ngSwitchCase="isuser===1 ||isuser===2||isuser===3"><a href="#">Contacts</a></li>
  <li *ngSwitchCase="isuser===1 ||isuser===2||isuser===3"><a href="#">Help</a></li>
</ul>
`
})
export class AppComponent {
  isuser:number=3;
  //1 admin
  //2 user
  //3 not logged in
}
