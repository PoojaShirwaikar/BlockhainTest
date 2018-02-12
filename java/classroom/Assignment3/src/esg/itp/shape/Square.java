package esg.itp.shape;

public class Square implements Polygon {
	
	float side, area, peri;
	
	public Square(float s) {
		// TODO Auto-generated constructor stub
		
		side=s;
		
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		 area=side*side;
		
	}
	
	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		peri=4*side;
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Area: "+area+" Perimeter: "+peri);
		
	}
}
