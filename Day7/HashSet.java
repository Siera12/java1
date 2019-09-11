import java.util.*;
class HashSet1{
	public static void main(String[] args){
		HashSet<String> h1=new HashSet<>();
	
		h1.add("Hanzo");
		h1.add("Genji");
		h1.add("Ana");
		h1.add("Moira");
		h1.add("Reinhardt");
		
		Iterator<String> itr=h1.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.println(str);
		}		
	}		
}