package com.psl.ques4;

class Printer implements Runnable{
    Storage s;
    public Printer(Storage s){
          this.s = s;
    }
    @Override
    public void run() {
          synchronized(s) {
                for(int i = 0; i < 10; i++) {
                      while(s.isPrinting()) {              
                            try {
                                  s.wait();
                            } catch(Exception e) {  }
                      }
                      System.out.println(Thread.currentThread().getName() + " " + s.getValue());
                      s.setFlag(true);
                      s.notify();
                }
          }
    }
     
}