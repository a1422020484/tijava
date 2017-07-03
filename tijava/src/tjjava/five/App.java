package tjjava.five;

public class App {

	public String nameString = "yang";
	
	public void play(){
		System.out.println(this.nameString);
	}
	
	public App(){
		
	}
	public App(int x){
		this();
	}
	public App(int x,int y){
		this(x);
	}
}
