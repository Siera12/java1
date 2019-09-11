import java.util.Scanner;
class Str{
	public static void main(String[] args){
		System.out.println("Enter random string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println("Entered String:"+s);

		String q1=s.substring(0,s.length()/2);
		String w1=q1.toUpperCase();

		String q2=s.substring(s.length()/2,s.length());
		String w2=q2.toLowerCase();
		

		System.out.println("Final:"+w1+w2);
	}	
}