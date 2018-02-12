package com.psl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Suggestion {
	@Pointcut(value = "execution(* com.psl.Shop.buy(..))")
	public void pc1() {
	}

	public void suggestion() {
		System.out.println("Some suggestions:");
		System.out.println("table cover");
		System.out.println("rug");
	}

	public void addToCart() {
		System.out.println("sofa fabric added to cart");
	}

	public void voucher() {
		System.out.println("VOUCHER: JHNVS978 ");

	}

	@Around(value = "pc1()")
	public void record(ProceedingJoinPoint jp) {
		// before

		long t1 = System.currentTimeMillis();
		suggestion();
		addToCart();
		// during
		try {
			jp.proceed();
			voucher();

			// throw new Exception("purchase unsuccessfull");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("purchase unsuccessfull");

		}
		// after
		long t2 = System.currentTimeMillis();
		System.out.println("Session took: " + (t2 - t1) + " milliseconds");

	}
}
