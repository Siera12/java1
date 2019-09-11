class Author{
	String name;
	String email;
	String gender;
	
	Author(String n,String e,String g){
		name=n;
		email=e;
		gender=g;
	}
	
	String getDetails(){
		return "Name:"+name+" "+"Email: "+email+" "+"Gender: "+gender;
	
	}

}

class Book{
	String name;
	Author author;
	double price;
	int qty;
	
	Book(String na,Author au,double pr){
		name=na;
		author=au;
		price=pr;
	}

	Book(String na,Author au,double pr,int qt){
		name=na;
		author=au;
		price=pr;
		qty=qt;
	}
	
	void bookDetail(){

		System.out.println("Book Details\n");
		System.out.println("Name:"+name+" "+"Author: "+author.getDetails()+" "+"Price: "+price+"Quantity: "+qty+"\n");
	}
}

class Test{
	public static void main(String[] args){

		Author a1=new Author("authname","abc@ggamil.com","male");
		Book b1=new Book("qwe",a1,78,3);
		b1.bookDetail();
}
}


	 