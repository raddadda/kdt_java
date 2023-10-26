package java_op;


public class Cat extends Animal{

//	public Student(String name, int age, String major) {
//		//super():하위클레스에서 상위클래스 생성자를 호출하는데 사용
//		//super키워드는 상위 클래스에서 오버라이드된 메서드를 호출하는데 사용
//		super(name,age);
//		this.major=major;
//	}
	public Cat(String species,String name,int age) {
		super("고양이",name,age);
//		this.species="고양이";
//		this.name=name;
//		this.age=age;
	}
	@Override
	public void makeSound() {
		System.out.println("야옹");
	}
	
	
}
