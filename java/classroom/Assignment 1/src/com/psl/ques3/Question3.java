package com.psl.ques3;

public class Question3 {
	//int pos=0;

	public int[] findPrime(int low, int high) {

		int[] prime = new int[20];
		//int[] prime = null;
		int isprime,  i, j, pos=0;

		for (i = low; i <= high; i++) {
			isprime = 1;
			for (j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
					isprime = 0;
					break;
				}
			}

			if (isprime == 1) {
			//	prime=new int[pos+1];
				prime[pos] = i;
				pos++;
			}

		}
		return prime;

		
	}

	public static void main(String[] args) {
		int low = 15;
		int high = 35;

		Question3 f = new Question3();
		int[] array = new int[20];
		array = f.findPrime(low, high);

		int l = array.length;
		//System.out.println("length: " + l);
		System.out.println("Prime nos: ");
		for (int s = 0; s <l; s++) {

			if(array[s]==0)
				break;
			
			System.out.println(array[s]);

		}

	}
}
