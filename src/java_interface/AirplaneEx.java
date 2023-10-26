package java_interface;


public class AirplaneEx extends Vehicle implements Flyable1{
	
//	public AirplaneEx (String name,int maxSpeed) {
//		
//	}
	
	@Override
	public void move() {
		System.out.println("하늘을 날아가능 중");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("고도 10,000피트에서 비행 중");
	}
	
}