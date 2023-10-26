package java_interface;

interface Move {
	void moveForward();
	void moveBackword();
}

interface Power {
	void powerOn();
	void powerOff();
}
//인터페이스는 인터페이스를 상속 받을 수 있음
interface Car extends Move, Power{
	void changeGear(int gear);
}
class Suv implements Car {

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		System.out.println("앞으로");
	}

	@Override
	public void moveBackword() {
		// TODO Auto-generated method stub
		System.out.println("뒤로");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("시동 ON");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("시동 OFF");
	}

	@Override
	public void changeGear(int gear) {
		// TODO Auto-generated method stub
		System.out.println("기어변경 :"+gear);
	}
	
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suv suv = new Suv();
		suv.powerOn();
		suv.powerOff();
		suv.changeGear(1);
		suv.moveBackword();
		suv.moveForward();
	}

}
