package java_interface;


abstract class Vehicle {
	//instanceof
	private String name;
	private int maxSpeed;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	abstract public void move();
	
}

interface Flyable1{
	void fly();
//	default void fly() {
//		System.out.println("디스플레이가 켜졌습니다");
//	}
}


