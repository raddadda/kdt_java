package java_interface;


//인터페이스의 특징
//1.추상화: 메서드를 선언하여 상속받은 클래스에서 사용하게함.
//2.다중 상속: 하나의 클래스는 여러 인터페이스를 구현할수 있음.
//하나의 인터페이스를 통해 여러 클래스에서 공통의 동작을 정의할 수 있고
//각 클래스는 그 동작을 자신의 방식대로 구현 할 수 있다.

public interface Gameconsole {
	void up();
	void down();
	void right();
	void left();
	
}
