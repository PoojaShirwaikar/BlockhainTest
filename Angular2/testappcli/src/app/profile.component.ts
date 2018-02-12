import { Component, OnInit, Input,EventEmitter,Output } from '@angular/core';
import {beanComponent} from './user'
@Component({
    selector: 'profile',
    template:`<h1> profile {{user2}}</h1>
     <input type="text" [(ngModel)]="user2"/>
    <button (click)="updateName()">update</button>
    
    
    
    `
})
export class profileComponent {
    @Input()
    user2:string;
    // user2:beanComponent;
    constructor() { }

    @Output()
    update:EventEmitter<string>= new EventEmitter<string>();
    updateName():void{
        console.log("inside");
        //trigger custom event 'update'
        this.update.emit(this.user2);

    }
}