import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { welcomecomponent } from './welcome.compoment';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent, welcomecomponent
      
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
