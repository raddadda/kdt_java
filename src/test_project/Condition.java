package test_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Condition {
	 public static double add(double a,double b) {
		 return a+b;
	 };
	 public static double dif(double a,double b) {
		 return a-b;
	 };
	 public static double div(double a,double b) {
		 return a/b;
	 };
	 public static double mul(double a,double b) {
		 return a*b;
	 };
	 public static void circle(double r,double w,double h,double a,double b) {
		 System.out.println("반지름이 "+(int)r+"인 원의 넓이 : "+Math.PI*r*r);
		 System.out.println("가로 "+(int)w+"세로"+(int)h+"인 직사각형의 넓이:"+w*h);
		 System.out.println("밑변"+(int)a+"높이 "+(int)b+"인 삼각형의 넓이:"+a*b*1/2);

	 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		//실습1
//		System.out.println("나이를 입력하세요");
//		int age = Integer.parseInt(br.readLine());
//		
//		if(1<=age && age <=7) {
//			System.out.println("유아");
//			
//		}else if(8<=age && age <=13){
//			System.out.println("초등학생");
//			
//		}else if(14<=age && age <=16) {
//			System.out.println("중학생");
//			
//		}else if(17<=age && age <=19) {
//			System.out.println("고등학생");
//		
//		}else {
//			System.out.println("성인");
//		
//		}

		//실습2
//		System.out.println("이름을 입력하세요");
//		String name  =br.readLine();
//		
//		if(name.equals("홍길동")) {
//			System.out.println("남");
//		}else if(name.equals("성춘향")) {
//			System.out.println("여");
//		}else {
//			System.out.println("모르겠어요.");
//		}
//		
		//실습3
//		
//		System.out.println("숫자를 입력하세요");
//		int num  = Integer.parseInt(br.readLine());
//		for(int i=1; i<=num; i++) {
//			sb.append(i).append(" ");
//		}
//		
//		System.out.print(sb);
		
		
		//실습4
//		System.out.println("숫자 두 개를 입력하세요");
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		double num1  = Double.parseDouble(st.nextToken());
//		double num2  = Double.parseDouble(st.nextToken());
//		
//		 sb.append("덧셈 결과 : "+add(num1,num2)+'\n')
//		 .append("뺄셈 결과 : "+dif(num1,num2)+'\n')
//		 .append("나눗셈 결과 : "+div(num1,num2)+'\n')
//		 .append("곱셈 결과 : "+mul(num1,num2));
//		 
//		 System.out.println(sb);

		 //실습5
		
		System.out.println("반지름,가로,세로,밑변,높이를 각각 적어주세요");
		StringTokenizer st = new StringTokenizer(br.readLine());
		double r  = Double.parseDouble(st.nextToken());
		double w  = Double.parseDouble(st.nextToken());
		double h  = Double.parseDouble(st.nextToken());
		double a  = Double.parseDouble(st.nextToken());
		double b  = Double.parseDouble(st.nextToken());
		circle(r,w,h,a,b);
	}


}
