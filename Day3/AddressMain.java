class Address{
	String hno;
	String street;
	String locality;
	String city;
	String pincode;
	
	Address(String h,String s,String l,String c,String p){
		hno=h;
		street=s;
		locality=l;
		city=c;
		pincode=p;
	}
	void addressDetail(){
		System.out.println("Address Details\n");
		System.out.println("House No:"+hno);
		System.out.println("Street  : "+street);
		System.out.println("Locality: "+locality);
		System.out.println("City    : "+city);
		System.out.println("Pincode :"+pincode);
	}
}

class Employee{
	int employeeid;
	String employeename;
	double basicsalary;
	Address address;
	
	Employee(int e, String en,double bs,Address ad){
		employeeid=e;
		employeename=en;
		basicsalary=bs;
		address=ad;
	}
	void printEmployeeDetails(){
		System.out.println("Employee Details\n");
		System.out.println("EmplyeeID      :"+employeeid);
		System.out.println("EmployeeName   : "+employeename);
		System.out.println("Basic Salary   : "+basicsalary);
		address.addressDetail();
	}
}

class PermamentEmployee extends Employee{
	double providentFund;
	double hra;
	PermamentEmployee(int e1,String en1,double bs1,Address ad1,double pf,double hr){
		super(e1,en1,bs1,ad1);
		providentFund=pf;
		hra=hr;
	}
	void printEmployeeDetails(){
		System.out.println("Employee Details\n");
		System.out.println("EmplyeeID      :"+employeeid);
		System.out.println("EmployeeName   : "+employeename);
		System.out.println("Basic Salary   : "+basicsalary);
		address.addressDetail();
		System.out.println("Provident Fund : "+providentFund);
		System.out.println("HRA            : "+hra);
	}
} 

class AddressMain{
	public static void main(String[] args){
		Address a1=new Address("45","acs_Street","g_loca","Noida","789456");
		a1.addressDetail();
		Employee e1=new Employee(87,"Sunil",1500,a1);
		e1.printEmployeeDetails();
		PermamentEmployee pe1=new PermamentEmployee(98,"nampal",8500,a1,789,412);
		pe1.printEmployeeDetails();
	}
}