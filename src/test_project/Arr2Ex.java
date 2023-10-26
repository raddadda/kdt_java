package test_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Arr2Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		System.out.println("5개의 정수를 입력하세");
		int[] score = new int[5];
		int sum=0;
		st = new StringTokenizer(br.readLine());

		for(int i=0; i<score.length; i++) {
			
			sum+= Integer.parseInt(st.nextToken());
			
		}
		double result = (double)sum/(double)5;
		System.out.println("평균: "+result);
		
	}

}
