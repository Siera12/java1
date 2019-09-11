class OutOfRangeException extends Exception{
	public String toString(){
	return "exception occured";
	}
}

class Student{
	String name;
	int mark1,mark2,mark3;
	Student(){
		
	}
	Student(String na,int m1,int m2,int m3)throws OutOfRangeException{
	if(m1<0||m1>100||m2<0||m2>100||m3<0||m3>100){
	throw new OutOfRangeException();
	}
	else{
	
	name=na;
	mark1=m1;
	mark2=m2;
	mark3=m3;
		
	}
	}
	
	void print(){
		double avg=(mark1+mark2+mark3)/3;
		System.out.println("Average mark of "+name+" is "+ avg);
	}
}

class StudentMain{
	public static void main(String[] args){

		String i1=args[0];
		int i2=0,i3=0,i4=0;
		try{	
		i2=Integer.parseInt(args[1]);
		i3=Integer.parseInt(args[2]);
		i4=Integer.parseInt(args[3]);
		}
		catch(Exception e){
			System.out.println("Marks dal de bhai ");
		}
		Student s=new Student();
		try{

		s=new Student(i1,i2,i3,i4);
		}
		catch(OutOfRangeException e){
		System.out.println("Marks should be between 0 to 100 ");
		}
		s.print();
	}
}