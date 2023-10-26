package test_project;

import java.util.ArrayList;
	
public class classEx2 {
//	private static int cnt =0;
	private int w;
	private int h;
	private static int cnt=0;
	public classEx2 (int w,int h) {
		this.w = w;
		this.h = h;
	}
	
	public void setW(int w) {
		this.w = w;
	}
	public int getW() {
		
		return w;
	}

	public void setH(int h) {
		this.h = h;
	}
	public int getH() {
		return h;
	}

	public int area() {
		cnt++;
		return this.w * this.h;
//		System.out.print();
	}
	
//
	public static int getCount() {
		
		return cnt;
//		System.out.print();
	}
	
}
