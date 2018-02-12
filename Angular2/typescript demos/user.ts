export class user{
  private  name:string;
  private age:number;
  private isIndian:boolean;
  constructor (name:string, age:number)
  {
      this.name=name;
      this.age=age;
      this.isIndian=true;
  }

  getName():string{
      return this.name;
  }

}

