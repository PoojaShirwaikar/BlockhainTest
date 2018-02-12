package com.psl.ques4;

public class TaxNotEligibleException extends Exception {

	public TaxNotEligibleException() {
		super("The employee does not need to pay tax");
	}

}
