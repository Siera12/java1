import java.sql.*;
import java.io.*;
class JdbcDemo4{
	public static void main(String[] args){
	try{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	
	System.out.println("Enter choice:\n Sign in:Press1\n Sign up:Press2");
	int choice=Integer.parseInt(br.readLine());
	
	if(choice==1){

	System.out.println("Enter new email");
	String email=br.readLine();
	System.out.println("Enter password");
	String password=br.readLine();

	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("Select * from user1");
	while(rs.next()){
	if(email.equals(rs.getString(2)) && password.equals(rs.getString(3))){
		System.out.println("Welcome");
	}else{
		System.out.println("Wrong password and id");
	}
	
	}
	/*int i=ps.executeUpdate();
	
	if(i!=0){
		System.out.println(i+"record affected");
	}*/

	}
	else if(choice==2){

	/*System.out.println("Enter id");
	int id=Integer.parseInt(br.readLine());*/
	System.out.println("Enter email");
	String email=br.readLine();
	System.out.println("Enter password");
	String password=br.readLine();
	System.out.println("Enter f_name");
	String f_name=br.readLine();
	System.out.println("Enter l_name");
	String l_name=br.readLine();
	
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
	PreparedStatement ps=conn.prepareStatement("Insert into user1 values(sequence_1.nextval,?,?,?,?)");
	/*ps.setInt(1,id);*/
	ps.setString(1,email);
	ps.setString(2,password);
	ps.setString(3,f_name);
	ps.setString(4,l_name);

	int i=ps.executeUpdate();
	
	if(i!=0){
		System.out.println(i+"record affected");
	}
	
	}


	}catch(Exception e){
		e.printStackTrace();
	}
	}
}