package com.psl.ques4;

public class Counter implements  Runnable{
    
    Storage s;
    public Counter(Storage store){
          s = store;
    }
    @Override
    public void run() {
          synchronized(s) {
                for(int i = 1 ; i <= 10; i++){
                      while(!s.isPrinting()) {              
                         try {
                            s.wait();
                         } catch(Exception e) {  }
                      }
                      s.setValue(i);
                     // System.out.println("in counter"+s.getValue());
                      s.setFlag(false);
                      s.notify();
                }
          }
    }

}
