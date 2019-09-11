class DemoThread1 implements Runnable{
	Thread t;
	DemoThread1(){
t=new Thread(this);
		t.start();
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try{
				t.sleep(2000);
			}
			catch(Exception e){
				System.out.println(e);
			} 
		}
	}
}

class DemoMain{
	public static void main(String[] args){
	
	
	System.out.println("im main thread");
	DemoThread1 d=new DemoThread1();
	DemoThread1 d1=new DemoThread1();
	DemoThread1 d2=new DemoThread1();
			
	}
}