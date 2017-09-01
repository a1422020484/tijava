package tjjava.ten;

interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {

	private Checkers() {

	}

	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Checkers();
		}
	};
}

class Chess implements Game{
	private Chess(){
		
	}
	private int moves = 0;
	private static final int MOVES = 4;
	@Override
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
	public static GameFactory gameFactory = new GameFactory() {
		
		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Chess();
		}
	};
}
public class Games {
	public static void playGame(GameFactory gameFactory){
		Game s = gameFactory.getGame();
		while (s.move()) {
			
		}
	}
	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.gameFactory);
	}
}
