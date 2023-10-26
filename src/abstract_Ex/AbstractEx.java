package abstract_Ex;

//추상 클래스
abstract class Animals{
	private int age;
	//추상메서드
	abstract public void sound();
	
	//일반메서드
	public void sleep() {
		System.out.println("동물이 잠을 잔다");
	}
}

//추상클래스 animal을 상속받는 chicken클래스
class Chicken extends Animals{
	
	@Override
	public void sound() {
		System.out.println("꼬꼬댁");
	}
}
public class AbstractEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//추상클래스는 인스턴스화 할 수 없음
		//Animals animal = new Animal();
		
//		Chicken chicken = new Chicken();
//		chicken.sound();
//		chicken.sleep();
		Kim kim = new Kim();
		Baek baek = new Baek();
		
		kim.todo();
		baek.todo();
		
	}

}
