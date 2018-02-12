package esg.itp.shape;

public class Rectangle implements Polygon{

	float length, breadth, area, peri;
	
	public Rectangle(float len, float bre){
		
		length=len;
		breadth=bre;
		
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		 area=length*breadth;
		
	}
	
	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		peri=2*(length+breadth);
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Area: "+area+" Perimeter: "+peri);
		
	}
	
}
