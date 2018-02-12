import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import { welcomecomponent } from './welcome.compoment';
import {productComponent} from './product.component';
import { AppComponent } from './app.component';
import {logincomponent} from './login.component';
import {FormsModule} from '@angular/forms';
import {mobileComponent} from './mobile.components';
import {profileComponent} from './profile.component';
import {appheaderComponent} from './appheader.component';
import {PhotoComponent} from './photos.component';
import {cartComponent} from './cart.component'
import {MenuComponent} from './menu.component'
import {RouterModule, Routes} from '@angular/router'
import {PNFComponent} from './pagenotfound.component'
import {laptopComponent} from './laptop.component'
import {allproductsComponent} from './allproducts.component'
import {ProductDetailsComponent} from './productdetails.component'
import {SignUpFormComponent} from './signupform.component'
import {CamelCasePipe} from './camelcase.pipe'
import {phonePipe} from './phonepipe.pipe'

let routes:Routes=[
  {
    path:'',
    component:welcomecomponent
  },
  {
    path:'welcome',
    component:welcomecomponent
  },
  {
  path:"login",
  component:logincomponent
},
{
  path:"product",
  component:productComponent,
  children:
  [
    {
      path:"mobile",
      component:mobileComponent
    },
    {
      path:"laptop",
      component:laptopComponent
    },
    {
      path:'',
      component:allproductsComponent,
      children:[
        {
          path:'productdetails/:productId',
          component:ProductDetailsComponent

        }
      ]
    }
  ]
},
{
  path:"photo",
  component:PhotoComponent
},
{
  path:'**',
  component:PNFComponent
}]


@NgModule({
  declarations: [
    CamelCasePipe,phonePipe,AppComponent, welcomecomponent,SignUpFormComponent,allproductsComponent,ProductDetailsComponent, productComponent,laptopComponent, logincomponent,PNFComponent, mobileComponent,MenuComponent, profileComponent,appheaderComponent,PhotoComponent,cartComponent
      
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule,RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
