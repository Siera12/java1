import java.util.Random;
class G{
G(){};
	boolean flag=false;
	int n;
	/**/

	synchronized void RandomNumber(){
		if(flag==true){
			try{			
				wait();
			}catch(Exception e){e.printStackTrace();}
		}
		
Random ra= new Random();
	int n=ra.nextInt(50);
		System.out.println("Random number: "+n);
		flag=true;
		notify();
	}
	synchronized void Factorial(){
		if(flag==false){
			try{
			wait();
			}
			catch(Exception e){e.printStackTrace();}
		}

		int fac=1;
		for(int i=1;i<=n;i++){    
     			 fac=fac*i;    
  			}    

		System.out.println("factorial: "+ fac);
		flag=false;
		notify();
		
	}
}
class GMa extends Thread{
	
	G g;
	GMa( G gobj){
		g=gobj;
		}
	public void run(){
		for(int i=0;i<10;i++){
		
		g.RandomNumber();
		}
	}
	
}
class GMa1 extends Thread{
	
	G g;
	GMa1( G gobj){
		g=gobj;
		}
	public void run(){
		for(int i=0;i<10;i++){
		
		g.Factorial();
		}
	}
	
}

class GMain{
	public static void main(String[] args){
		G g=new G();
		GMa x1=new GMa(g);
		GMa1 x2=new GMa1(g);
		Thread t1=new Thread(x1);
		Thread t2=new Thread(x2);
		t1.start();
		t2.start();
}
}
		
	

	