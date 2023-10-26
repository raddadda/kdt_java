package java_op;

public class Person extends Object{
	private String name;
	private int age;
	
	//생성자
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	//Overriding된것이라고 컴파일에게 알려주는것 
	
	@Override
	public String toString() {
		 //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return "Person / name : "+ name  + ", age : "+ age;
	}
	//오버로딩
	public String toString(int a) {
		 //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return "Person / name : "+ name  + ", age : "+ a;
	}
	
	
}
