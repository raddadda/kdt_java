package java_op;

public class Student extends Person {

	
	private String major;
	
	public Student(String name, int age, String major) {
		//super():하위클레스에서 상위클래스 생성자를 호출하는데 사용
		//super키워드는 상위 클래스에서 오버라이드된 메서드를 호출하는데 사용
		super(name,age);
		this.major=major;
	}
	
	@Override
	public String toString() {
		 //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return "Person /" + super.toString() + ", major : "+ major;
	}
}
