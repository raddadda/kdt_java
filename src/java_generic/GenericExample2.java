package java_generic;
//Box클래스의 제네릭은 숫자만 들어갈 수 있다.

class Box<T extends Number>{
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	
}

interface Movable {
	void move();
}
class Car implements Movable {
	
	@Override
	public void move() {
		System.out.println("자동차 출발");
	}
}
//제네릭 클래스
//Movable 인터페이스를 쓰는 클래스인 Car같은것만 사용 할 수 있게 된다.

class Container<T extends Movable> {
	private T item;
	
	public Container(T item) {
		this.item = item;
	}
	public void makeItMove(){
		item.move();
	}
}
public class GenericExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box<String> stringBox = new Box<>();
//		stringBox.setItem("Hello World");
//		String value = stringBox.getItem();
//		System.out.println(value);
		Box<Double> doubleBox = new Box<>();
		//string은 number가 아니라 에러가 난다.
		//Box<String> doubleBox1 = new Box<>();
		Box<Integer> doubleBox2 = new Box<>();
		
		Car a = new Car();
		
		Container<Car> container = new Container<>(new Car());
	}

}
