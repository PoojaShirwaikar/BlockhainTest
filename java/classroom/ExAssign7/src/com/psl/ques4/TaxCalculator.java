package com.psl.ques4;

public class TaxCalculator {

	public TaxCalculator() {
		// TODO Auto-generated constructor stub
	}

	private double calculateTax(String empName1, boolean isIndian1, double empSal1)
			throws CountryNotValidException, EmployeeNameInvalidException,
			TaxNotEligibleException {
		// TODO Auto-generated method stub

		String empName = empName1;
		boolean isIndian = isIndian1;
		double empSal = empSal1;

		double taxAmount = 0.0;

		if (!isIndian) {
			throw new CountryNotValidException();
		}
		if (empName == null) {
			throw new EmployeeNameInvalidException();
		}

		if (empSal > 100000.0 && isIndian) {
			taxAmount = empSal * 8 / 100;
		} else if (empSal > 50000 && empSal <= 100000 && isIndian) {
			taxAmount = empSal * 6 / 100;

		} else if (empSal > 30000 && empSal <= 50000 && isIndian) {
			taxAmount = empSal * 5 / 100;

		} else if (empSal > 10000 && empSal <= 30000 && isIndian) {
			taxAmount = empSal * 4 / 100;
		}

		else {
			throw new TaxNotEligibleException();

		}

		return taxAmount;

	}

	public static void main(String[] args) {
		TaxCalculator c = new TaxCalculator();

		try {
			double taxAmount = c.calculateTax("xxxx", true, 1000000);
			System.out.println("Tax Amount: " + taxAmount);

		} catch (CountryNotValidException | EmployeeNameInvalidException
				| TaxNotEligibleException e) {
			e.printStackTrace();
		}

	}

}
