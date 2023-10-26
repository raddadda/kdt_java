package java_interface;


interface controller {
	void powerOn();
	void powerOff();
	//implements에 추가하지 않고 추가하는법
	default void display() {
		System.out.println("디스플레이가 켜졌습니다");
	}
}

class TV implements controller {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("TV power ON");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("TV power OFF");
	}
	
}

class Computer implements controller {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Computer power ON");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Computer power OFF");
	}}


public class interfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		Computer computer = new Computer();
		
		tv.powerOn();
		tv.display();
		tv.powerOff();
		computer.powerOn();
		computer.powerOff();
	}

}
