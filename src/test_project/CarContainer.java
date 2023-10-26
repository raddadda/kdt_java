package test_project;

public class CarContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Car bmw = new Car(30);
		Car kia = new Car(20);
		
		//잘못된 접근 방
//		bmw.speed = 120;
//		kia.speed = 90;
		
		bmw.start();
		kia.start();
		
		bmw.setSpeed(-120);
		kia.setSpeed(-90);
		//비효율적
//		int bmwSpeed = bmw.getSpeed();
//		bmwSpeed = bmwSpeed +100;
//		bmw.setSpeed(bmwSpeed);
//		int kiaSpeed = kia.getSpeed();
//		kiaSpeed = kiaSpeed +80;
//		kia.setSpeed(kiaSpeed);
		bmw.increseSpeed(140);
		kia.increseSpeed(100);

//		bmw.setSpeed(120);
//		kia.setSpeed(90);;
		
		System.out.println("bmw: "+bmw.getSpeed());
		System.out.println("kia: "+kia.getSpeed());

		

	}

}
