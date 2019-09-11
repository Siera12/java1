class DemoThread1 extends Thread{
	
	DemoThread1(){

		this.start();
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try{
				sleep(2000);
			}
			catch(Exception e){
				System.out.println(e);
			} 
		}
	}
}

class DemoMain1{
	public static void main(String[] args){
	
	
	System.out.println("im main thread");
	DemoThread1 d=new DemoThread1();
	DemoThread1 d1=new DemoThread1();
	DemoThread1 d2=new DemoThread1();
			
	}
}