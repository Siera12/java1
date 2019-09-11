import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.*;
import java.lang.*; 
import java.io.*; 

class Hashgg{
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
		
		TreeSet<String> ts=new TreeSet<>(h1);
		System.out.println(ts);
		
		Iterator<String> itr1=ts.descendingIterator();
		while(itr.hasNext()){
			String str1=itr1.next();
			System.out.println(str1);
		
		
		 /*List<String> list = new ArrayList<String>(h1); 
        	 Collections.sort(list); 
		
		Iterator<String> itr1=h1.iterator();
		while(itr.hasNext()){
			String str1=itr1.next();
			System.out.println(str1);

		}
		
		List<String> list1 = new ArrayList<String>(h1); 
        	 Collections.sort(list1); 
		Iterator<String> itr1=h1.descendingIterator();
		while(itr.hasNext()){
			String str2=itr2.next();
			System.out.println(str2);
		
		}*/	
	}		
}