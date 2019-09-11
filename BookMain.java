/*class ThirdDemo{
	public static void main(String[] args){
	String msg=args[0];
	String msg1=args[1];
	System.out.println(msg+" technologies "+msg1);
	}
}*/







/*class Book{
		int bookIsbn;
		String bookTitle;
		String authorname;
		double price;
		double dper;
		
	
	
	void setvalue(int isbn,String title,String aname,double pr){
		bookIsbn=isbn;
		bookTitle=title;
		authorname=aname;
		price=pr;
		}
	void print(){
		System.out.println("Book ISBN  : "+bookIsbn);
		System.out.println("Book Title : "+bookTitle);
		System.out.println("Author Name: "+authorname);
		System.out.println("Price      : "+price);
		}
	void discount(double pr){
		price=price-((pr/100)*price);
		System.out.println("Discount price  : "+price+"\n");
		}
	
}

class BookMain{
	public static void main(String[] args){
	
		Book b1=new Book();
		b1.setvalue(64541,"Kuch bhi","Koi bhi",800);
		b1.print();
		b1.discount(76);

		Book b2=new Book();
		b2.setvalue(89541,"Kuch bhi1","Koi bhi2",1800);
		b2.print();
		b2.discount(56);

		Book b3=new Book();
		b3.setvalue(64581,"Kuch bhi2","Koi bhi2",7800);
		b3.print();
		b3.discount(12);

	}
} */











class ObjectCounter{	
	static int counter=0;
	ObjectCounter(){
	counter++;
	}
	static int getObjectCount(){
	return counter;
	}
}

class ObjMain{
	public static void main(string[] args){
	System.out.println(ObjectCouneter.getObjectCount());
	
	new ObjectCounter();
	System.out.println(ObjectCouneter.getObjectCount());
	
	new ObjectCounter();
	System.out.println(ObjectCouneter.getObjectCount());
		
	}
}




















