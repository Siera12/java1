package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test{
	public static void main(String[] args){
		Veena v=new Veena();
		v.play();
		Playable p1=v;
		p1.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable p2=s;
		p2.play();
		
}
}