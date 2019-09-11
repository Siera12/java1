
/*class Mythread extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Child Thread"+getName());
			try{
			sleep(1000);
			}catch(Exception e){
				System.out.println("Child Thread"+e);
			}
		}
	}
}*/

class MyMain extends Thread{
	public static void main(String[] args){
		
		LocalTime t5=new LocalTime.now();
		
		public void run(){
		for(int i=0;i<2;i++){
			System.out.println("Child Thread"+getName());
			System.out.println("time"+t5);
			try{
			sleep(10000);
			}catch(Exception e){
				System.out.println("Child Thread"+e);
			}
		}
	
		
		Thread.currentThread().setName("MyThread");
		
					
	}
}