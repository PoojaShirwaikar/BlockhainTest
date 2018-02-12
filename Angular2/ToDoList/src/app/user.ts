import { Component, OnInit } from '@angular/core';
export class beanComponent {
    name:string;
    // age:number;
    role:boolean;
password:string;
    constructor(name:string,password:string,role:boolean) {
        this.name=name;
        // this.age=age;
        this.password=password;
        this.role=role;
     }

}