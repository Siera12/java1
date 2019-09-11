import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
class Employee implements Comparable<Employee>{
	int id;
	String name;
	Employee(int ide,String na){
		id=ide;
		name=na;
	}
	public String toString(){
		return "id="+id+"name="+name;
	}
	public int compareTo(Employee e){
			
		String name1=name;
		String name2=e.name;	
		return name1.compareTo(name2);		
	}		
}

class Demo{
	public static void main(String[] args){
		LinkedList<Employee> l1=new LinkedList<>();

		l1.add(new Employee(1,"Hanzo"));
		l1.add(new Employee(2,"Genji"));
		l1.add(new Employee(3,"Ana"));
		l1.add(new Employee(4,"Hog"));
		l1.add(new Employee(5,"Lucio"));

		Collections.sort(l1);
		
		Iterator<Employee> itr=l1.iterator();
		while(itr.hasNext()){
			/*Employee str=itr.next();*/
			System.out.println(itr.next());
		}	
	}
}