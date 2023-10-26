package abstract_Ex;

abstract class Student {
	private String name;
	private String school;
	private int age;
	private int num;
	
	
	abstract public void todo();
}

class Kim extends Student{
	

	@Override
	public void todo() {
		System.out.println("점심은 김가네 김밥");
	}
//	public Kim(String name,String school,int age,int num) {
//		this.name=name;
//		this.school=school;
//		this.age=age;
//		this.num=num;
//	}
	public Kim() {
		super();
		
	}
}
class Baek extends Student{
	
//	private String name;
//	private String school;
//	private int age;
//	private int num;
	
	@Override
	public void todo() {
		System.out.println("점심은 백종원 피자");
	}
	
//	public Baek(String name,String school,int age,int num) {
//		this.name=name;
//		this.school=school;
//		this.age=age;
//		this.num=num;
//
//	}
	public Baek() {
		super();
	}
	
}