import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { welcomecomponent } from './welcome.compoment';
import {todoComponent} from './todo.component'
import { AppComponent } from './app.component';
import {productComponent} from './product.component';
import {HttpClientModule} from '@angular/common/http';
import {pendingComponent} from './pending.component';
import {completeComponent} from './completed.component';
import {RouterModule, Routes} from '@angular/router';
import {PNFComponent} from './pagenotfound.component';
import {MenuComponent} from './menu.component'
import {beanComponent} from './user'
import {logincomponent} from './login.component'
import {FormsModule} from '@angular/forms'
import {summaryComponent} from './todosummary.component'
import {profileComponent} from './profile.component'
let routes:Routes=[
  {
    path:'',
    component:logincomponent,    
  },
  {
    path:'welcome',
    component:welcomecomponent
  },
  {
    path:'login',
    component:logincomponent,
    
  },
  {
    path:"todolist/:list",
    component:productComponent,
    children:
    [
      {
        path:"pending",
        component:pendingComponent
      },
      {
        path:"completed",
        component:completeComponent
      },
      {
        path:"todosummary",
        component:summaryComponent,
      },
      {
        path:'profile',
        component:profileComponent
      }]
  },
{
path:"todolist",
component:productComponent,

},
{
  path:'**',
  component:PNFComponent
}
]



@NgModule({
  declarations: [
    AppComponent, welcomecomponent,profileComponent,summaryComponent,logincomponent,todoComponent,productComponent,PNFComponent,MenuComponent,completeComponent,pendingComponent
      
  ],
  imports: [
    BrowserModule,HttpClientModule,RouterModule.forRoot(routes),FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
