import java.util.Scanner;
class Str1{
	public static void main(String[] args){
		System.out.println("Enter random string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println("Entered String:"+s);
		
		String w1=s.replace("ICS102","Iris Lab");
		
		System.out.println("New String:"+w1);

	}		
}