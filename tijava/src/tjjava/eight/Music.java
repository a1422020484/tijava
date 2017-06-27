package tjjava.eight;



public class Music{
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind fluteWind = new Wind();
		tune(fluteWind);
		
		Stringed stringed = new Stringed();
		tune(stringed);
	}
}

class Instrument{
	public void play(Note n){
		System.out.println("Instrument Play " + n);
	}
}

class Wind extends Instrument{
	public void play(Note n){
		System.out.println("Wind play " + n);
	}
}

class Stringed extends Instrument{
	public void play(Note n){
		System.out.println("Stringed play " + n);
	}
}