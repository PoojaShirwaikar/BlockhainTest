package com.psl.ques4;

class Storage{
    int  val;
    boolean flag = true;
    public void setValue(int val){
          this.val = val;
        //  System.out.println("in storage"+val);
    }
    public int getValue(){
          return this.val;
    }
    public boolean isPrinting() {
          return flag;
    }
    public void setFlag(boolean p) {
    	flag = p;
    }
}