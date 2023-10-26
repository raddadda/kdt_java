package java_interface;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LoLGame game = new LoLGame();
//		game.up();
//		game.down();
//		game.right();
//		game.left();
//		
//		DiableGame game2 = new DiableGame();
//		
//		game2.up();
//		game2.down();
//		game2.right();
//		game2.left();
		
		Vehicle[] v = {new CarEx(), new AirplaneEx()};
		for(Vehicle ve: v) {
			
			if(ve instanceof CarEx) {
				ve.setMaxSpeed(180);
				System.out.println("bmw속도: "+ve.getMaxSpeed());
			}
			if(ve instanceof AirplaneEx) {
				ve.setMaxSpeed(1000);
				System.out.println("Boeing속도: "+ve.getMaxSpeed());
			}
			
			ve.move();
			if(ve instanceof AirplaneEx) {
				Flyable1 f2 = new AirplaneEx();
				f2.fly();
				
			}
		}
	}

}
