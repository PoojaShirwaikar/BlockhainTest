package com.psl.ques2;


public class Thread100 implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
	
		
			while(count<10)
			{
				if (Thread.currentThread().getName().equals("one")) {
					//System.out.println(Thread.currentThread().getName());
				//	Thread100 obj = new Thread100();

					Thread t = new Thread(Thread.currentThread(), Thread.currentThread().getName()+count);
					t.start();
					count++;

					System.out.println("Hello, this is thread "+count);
					
					
				}
			}

		 
		
	}
	
	public static void main(String[] args) {

		Thread100 obj = new Thread100();
		Thread t1 = new Thread(obj, "one");

		t1.start();
	}

	


}
