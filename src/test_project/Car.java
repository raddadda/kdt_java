package test_project;

import java.util.*;

public class Car {
	//접근 제어자
	//public:같은 클래스,같은패키지, 자식클래스, 전체
	//protected : 같은 클래스,같은 패키지, 자식클래스
	//default : 같은 클래스, 같은패키지
	//private : 같은 클래스
	private int speed;
	
	
	//생성자
	public Car (int speed) {
		this.speed = speed;
	}
	
	public void start() {
		System.out.println("Car Start");
		System.out.println(this.speed);
	}

	public void increseSpeed(int speed) {
		this.speed = this.speed +speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		//유효성 검
		if(speed > 0) {
			this.speed = speed;
		}
	}
	
	public Car() {
		
	}

//	//setter메소드
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	//getter메소드
//	public int getSpeed() {
//		return this.speed;
//	}
	
	
}
