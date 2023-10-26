package test_project;

public class StaticEx {
	//MathUtil math = new MathUtil();
	
	public static void main(String[] args) {
		
		System.out.println(MathUtil.circle(3.3));
	}
	
	
}


class MathUtil {
	private static double PI = 3.14;
	
	//메소드
	public static double circle(double radius) {
		return PI*radius*radius;
	}
	

	
}