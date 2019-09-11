abstract class Animal{
	protected int legs;
	protected Animal(int l){
		legs=l;	
	}
	abstract void eat();
	void walk(){
		System.out.println("The Animal walks with "+legs+" legs.");
	}
}

class Spider extends Animal{
	Spider(){
	super(8);	
	}
	void eat(){
		System.out.println("Spider eat");
	}
}

interface Pet{
	String getname();
	void setname(String n);
	void play();
}

class Cat extends Animal implements Pet{
	String petname;
	Cat(String pn){
		super(4);
		petname=pn;
	}
	Cat(){
		
		this(" ");
	}
	public String getname(){
		return petname ;
	}
	public void setname(String name){
		petname=name;
	}
	public void play(){
		System.out.println("play cat");
	}
	void eat(){
		System.out.println("Cat eat");
	}
}

class Fish extends Animal{
	Fish(){
	super(0);
	}
	void eat(){
		System.out.println("Fish eat");
	}
	void walk(){
		System.out.println("Fish doesnt walk");
	}
}
class Test{
	public static void main(String[] args){
	Animal a=new Fish();
	a.eat();
	a.walk();

	Animal c=new Cat();
	c.eat();
	c.walk();
	}
}