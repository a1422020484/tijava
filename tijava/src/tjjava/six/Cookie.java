package tjjava.six;

public class Cookie {
	
//	public Cookie(){
//		System.out.println("Cookie constructor!");
//	}
	
	Cookie(String name){
		System.out.println("cookie"+name);
	}
	
	public void bitePublic(){
		System.out.println("public bitPublic!");
	}
	
	protected void bite(){
		System.out.println("protected bite!");
	}
	
	private void bitePriv(){
		System.out.println("private bitePriv!");
	}
}

class cookie2{
	cookie2(){
		System.out.println("cookie2!");
	}
}
