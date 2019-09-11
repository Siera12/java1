
	ResultSet rs=st.executeQuery("select * from employees");
	
	while(rs.next()){
		int id=rs.getInt(1);
		String name=rs.getString(2);
		
		System.out.println(id+" "+name);
		}
	conn.close();
	}
	catch(Exception e){
	e.printStackTrace();
	}
	}
}