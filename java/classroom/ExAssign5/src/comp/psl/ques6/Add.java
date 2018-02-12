package comp.psl.ques6;

public class Add {

	public Add(int... a) {
		// TODO Auto-generated constructor stub

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		System.out.println("Sum: " + sum);

	}

	public static void main(String[] args) {
		new Add(5, 6, 7, 8);

	
	}

}
