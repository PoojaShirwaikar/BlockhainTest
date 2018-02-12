package com.psl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Test s = new Test();
		Integer sum = 0, product = 1;
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> odd3 = new ArrayList<Integer>();
		List<Integer> even3 = new ArrayList<Integer>();
		List<Integer> multiple7 = new ArrayList<Integer>();

		list.add(4);
		list.add(9);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(7);

		sum = s.sum(list);
		System.out.println("sum: " + sum);

		product = s.product(list);
		System.out.println("product: " + product);

		odd = s.isOdd(list);
		System.out.print("ODD NOS: ");
		for (Integer o : odd) {
			System.out.print(o + " ");
		}
		System.out.println();

		even = s.isEven(list);
		System.out.print("Even NOS: ");
		for (Integer e : even) {
			System.out.print(e + " ");
		}
		System.out.println();

		even3 = s.even3(list);
		System.out.println("\n divisible by 3 and even");
		for (Integer o3 : even3) {
			System.out.println(o3 + " ");

		}

		odd3 = s.odd3(list);
		System.out.println("\n divisible by 3 and odd");
		for (Integer o3 : odd3) {
			System.out.println(o3 + " ");

		}
		multiple7 = s.mult7(list);
		System.out.println("\n multiple of 7");
		for (Integer m7 : multiple7) {
			System.out.print(m7 + " ");

		}
		s.foobar();
		s.planet();
	}

	public Integer sum(List<Integer> list) {
		Integer sum = 0;

		for (Integer list1 : list) {
			sum = sum + list1;
		}
		return sum;
		// System.out.println("sum: " + sum);
	}

	public Integer product(List<Integer> list) {
		Integer product = 1;

		for (Integer list1 : list) {
			product = product * list1;
		}

		return product;
		// System.out.println("product: " + product);
	}

	public List<Integer> isOdd(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		for (Integer l : list) {
			if (l % 2 != 0) {
				list1.add(l);
			}
		}
		return list1;

	}

	public List<Integer> isEven(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		for (Integer l : list) {
			if (l % 2 == 0) {
				list1.add(l);
			}
		}

		return list1;

	}

	public List<Integer> even3(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1 = isEven(list);

		for (Integer e3 : list1) {
			if (mul3(e3))
				list2.add(e3);
			// System.out.println(e3);
		}
		return list2;

	}

	// public void odd3(List<Integer> list) {
	// List<Integer> list1 = new ArrayList<Integer>();
	// list1 = isOdd(list);
	//
	// System.out.println("divisible by 3 and odd");
	// for (Integer e3 : list1) {
	// if (mul3(e3))
	// System.out.print(e3 + " ");
	// }
	// System.out.println();
	// }

	public List<Integer> odd3(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1 = isOdd(list);

		// for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
		// Integer e3 = (Integer) iterator.next();
		// if (!mul3(e3))
		// // System.out.print(e3 + " ");
		// list1.remove(e3);
		//
		// }

		for (Integer o3 : list1) {
			if (!mul3(o3))
				list2.add(o3);
			// System.out.print(e3 + " ");
			// list1.remove(e3);
		}

		return list2;
		// System.out.println();
	}

	public List<Integer> mult7(List<Integer> list) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		System.out.println("multiples of 7");
		for (Integer l3 : list1) {
			if (mul7(l3)) {
				list2.add(l3);
				// System.out.println(l3);
			}
		}
		return list2;

	}

	public void foobar() {
		System.out.println("FOO-BAR:");
		for (int d = 0; d <= 100; d++) {
			if (mul3(d))
				System.out.print("foo");
			if (mul5(d))
				System.out.println("bar");
			else
				System.out.println(d);
		}
	}

	public void planet() {
		System.out.println("PLANET:");
		for (int d = 0; d <= 20; d++) {
			if (mul3(d))
				System.out.print("earth");
			if (mul5(d))
				System.out.print("jupiter");
			if (mul9(d))
				System.out.print("pluto");
			else if (!mul3(d) && !mul5(d) && !(mul9(d)))
				System.out.println(d);
		}
	}

	public boolean mul3(Integer n) {
		if (n % 3 == 0)
			return true;
		else
			return false;
	}

	public boolean mul5(Integer n) {
		if (n % 5 == 0)
			return true;
		else
			return false;
	}

	public boolean mul7(Integer n) {
		if (n % 7 == 0)
			return true;
		else
			return false;
	}

	public boolean mul9(Integer n) {
		if (n % 9 == 0)
			return true;
		else
			return false;
	}
}
