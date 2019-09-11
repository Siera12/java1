import java.util.Scanner;
class Rectangle{

	double length;
	double breadth;
	double perimeter;
	double area;
	
	Rectangle(double le,double br){
		length=le;
		breadth=br;	
	}

	void peri( ){
		perimeter=(2*(length+breadth));
		System.out.println("Perimeter:\n"+perimeter);
	}
	
	void are(){
		area=(length*breadth);
		System.out.println("Area:\n"+area);
	}

}

class Main{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter len and breadth:\n");
		double l=0;
		double b=0;
		try{
		l=sc.nextDouble();
		b=sc.nextDouble();
		}
		catch(Exception e){
		System.out.println("Exception"+e);
		
		}
		Rectangle r=new Rectangle(l,b);
		r.peri();
		r.are();
	}
}