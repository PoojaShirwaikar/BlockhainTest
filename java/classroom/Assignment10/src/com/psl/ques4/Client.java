package com.psl.ques4;

class Client {
    public static void main(String[] args) {
          Storage s = new Storage();
          Counter c = new Counter(s);
          Printer p = new Printer(s);
         Thread t1= new Thread(c,"Counter");
         t1.start();  
         
         Thread t2=new Thread(p,"Printer");
         t2.start();   
    }
}