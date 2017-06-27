package tjjava.eight;

public class Transmogrify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}

}

class Actor{
	public void act(){
		
	}
}

class HappyActor extends Actor{
	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor{
	public void act(){
		System.out.println("sadActor!!");
	}
}

class Stage{
	private Actor actor = new HappyActor();
	public void change(){
		actor = new SadActor();
	}
	public void performPlay(){
		actor.act();
	}
}
