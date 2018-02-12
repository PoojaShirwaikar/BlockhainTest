package com.psl.ques2;

public class TechnicalManager {

	int NoOfEmployeeReporting;
	String WorkPlace;
	int promotionsTillDate;
	int NoOfProjects;

	public TechnicalManager() {
		
	}

	public TechnicalManager(int NoOfEmployeeReporting, String WorkPlace,
			int promotionsTillDate, int NoOfProjects) throws MyCustomException {
		this.NoOfEmployeeReporting = NoOfEmployeeReporting;
		this.WorkPlace = WorkPlace;
		
		if(promotionsTillDate==0 || NoOfProjects==0){
			
			throw new MyCustomException();
			
			
		}
		else
		{
			this.promotionsTillDate = promotionsTillDate;
			this.NoOfProjects = NoOfProjects;
		}
		
		
	}

	public int getNoOfEmployeeReporting() {
		return NoOfEmployeeReporting;
	}

	public void setNoOfEmployeeReporting(int noOfEmployeeReporting) {
		NoOfEmployeeReporting = noOfEmployeeReporting;
	}

	public String getWorkPlace() {
		return WorkPlace;
	}

	public void setWorkPlace(String workPlace) {
		WorkPlace = workPlace;
	}

	public int getPromotionsTillDate() {
		return promotionsTillDate;
	}

	public void setPromotionsTillDate(int promotionsTillDate) {
		this.promotionsTillDate = promotionsTillDate;
	}

	public int getNoOfProjects() {
		return NoOfProjects;
	}

	public void setNoOfProjects(int noOfProjects) {
		NoOfProjects = noOfProjects;
	}
	
	
	public static void main(String[] args) {
		TechnicalManager tm= new TechnicalManager();
		
		TechnicalManager[] array= new TechnicalManager[5];
		
		try{
			
			array[0]= new TechnicalManager(5,"goa",15,5);
			array[1]= new TechnicalManager(5,"hyderabad",4,5);
			array[2]= new TechnicalManager(5,"pune",4,5);
			array[3]= new TechnicalManager(5,"goa",10,5);
			array[4]= new TechnicalManager(5,"banglore",11,5);
			
		}
		catch(MyCustomException e)
		{
			e.printStackTrace();
		}
		
		for (TechnicalManager technicalManager : array) {
			if(technicalManager.getPromotionsTillDate()>10)
			{
				System.out.println("Promoions: "+technicalManager.promotionsTillDate+" No. of Reporting employees: "+technicalManager.NoOfEmployeeReporting+" No. of projects: "+technicalManager.NoOfProjects+" Workplace: "+technicalManager.WorkPlace);
			}
		}
		

		
	}
	
	

}
