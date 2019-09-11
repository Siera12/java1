import java.util.Random;
abstract class Instrument{
	abstract void play();
}

class Piano extends Instrument{
	void play(){
		System.out.println("Piano is playing tan tan tan");
	}
}

class Flute extends Instrument{
	void play(){
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument{
	void play(){
		System.out.println("Guitar is playing tin tin tin tin");
	}
}

class InstrumentMain{

	Random rand = new Random();
	int n = rand.nextInt(50);

	
	public static void main(String[] args){
		
	Random rand = new Random();
	
	for

	Instrument arr[]=new Instrument[3];
	arr[0]=new Piano();
	arr[1]=new Flute();
	arr[2]=new Guitar();
	
	
	for(int i=0;i<arr.length;i++){
		arr[i+n].play();	
	}
	}
}