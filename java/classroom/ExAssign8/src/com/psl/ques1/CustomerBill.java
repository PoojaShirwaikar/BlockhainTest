package com.psl.ques1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class CustomerBill {

	String CustomerName;
	String travelMonth;
	double packages;
	double food;

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getTravelMonth() {
		return travelMonth;
	}

	public void setTravelMonth(String travelMonth) {
		this.travelMonth = travelMonth;
	}

	public double getPackages() {
		return packages;
	}

	public void setPackages(double packages) {
		this.packages = packages;
	}

	public double getFood() {
		return food;
	}

	public void setFood(double food) {
		this.food = food;
	}

	public boolean isDouble(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;

	}

	public boolean isNegative(String str) {
		double d = 0.0;
		try {
			d = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return false;
		}
		if (d < 0)
			return true;
		else
			return false;

	}

	ArrayList<CustomerBill> getCustomerDetails(String fileName) {
		ArrayList<CustomerBill> a = new ArrayList<CustomerBill>();
		CustomerBill c = new CustomerBill();

		String str = null;
		File f = new File(fileName);
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while ((str = br.readLine()) != null) {
				String s[] = str.split("\t");
				// System.out.println(s[0]+" "+s[1]+" "+s[2]+" "+s[3]);
				// System.out.println(s.length);
				if (s.length < 3) {
					throw new NoDataFound();

				} else if (isNegative(s[2]) || isNegative(s[3])
						|| !isDouble(s[2]) || !isDouble(s[3])) {

					throw new InvalidData();

				}

				c.setCustomerName(s[0]);
				c.setTravelMonth(s[1]);
				c.setPackages(Double.parseDouble(s[2]));
				c.setFood(Double.parseDouble(s[3]));

				a.add(c);

				
			}
			

			br.close();
			fr.close();
			
			return a;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoDataFound | InvalidData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	void calculateDiscount(ArrayList<CustomerBill> customer) {
		double discount=0;
		double npa=0;

		//System.out.println(customer.size());
		
		for (CustomerBill customerBill : customer) {
			
			
			if ((customerBill.getTravelMonth().equals("April"))
					|| (customerBill.getTravelMonth().equals("May"))
					|| (customerBill.getTravelMonth().equals("June"))
					|| (customerBill.getTravelMonth().equals("July"))
					|| (customerBill.getTravelMonth().equals("August"))) {
				
				discount=customerBill.getPackages()*0.3 + customerBill.getFood()*0.2;
				npa=(customerBill.getPackages()+customerBill.getFood())-discount;
				

			} else if ((customerBill.getTravelMonth().equals("September"))
					|| (customerBill.getTravelMonth().equals("October"))
					|| (customerBill.getTravelMonth().equals("February"))
					|| (customerBill.getTravelMonth().equals("March"))) {
				
				discount=customerBill.getPackages()*0.2 + customerBill.getFood()*0.1;
				npa=(customerBill.getPackages()+customerBill.getFood())-discount;
				

			} else if ((customerBill.getTravelMonth().equals("November"))
					|| (customerBill.getTravelMonth().equals("February"))) {
				
				discount=customerBill.getPackages()*0.1 + customerBill.getFood()*0.05;
				npa=(customerBill.getPackages()+customerBill.getFood())-discount;
				
				

			} else if (customerBill.getTravelMonth().equals("December")) {
				
				discount=0;
				npa=(customerBill.getPackages()+customerBill.getFood())-discount;

			}
			
			System.out.println("Package:\t"+customerBill.getPackages());
			System.out.println("Food:\t"+customerBill.getFood());
			System.out.println("Discount:\t"+discount);
			System.out.println("Net payable amount:\t"+npa);
			System.out.println("\n");

	
		}

	}

	public static void main(String[] args) {
		ArrayList<CustomerBill> a = new ArrayList<CustomerBill>();
		CustomerBill c = new CustomerBill();

		a = c.getCustomerDetails("Customer.txt");
		c.calculateDiscount(a);

	}

}
