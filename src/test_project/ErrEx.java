package test_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ErrEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		//입력오류 발생 -> InputMisMatchException
		//숫자변환 오류 -> NumberFormatException
		//객체잠조가 null인 상태에서 객체의 매서드 속성에 접근할때 발생하는 오류 -> NullPointerExceoption
		//파일이 존재하지 않을 때 (컴파일러에 의해 체크됨)-> FileNotFoundException
		
		
//		int[] arr = {1,2,3,4};
//		try {
//			for(int i=0; i<5; i++) {
//				System.out.println(arr[i]);
//			}
//			
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("인덱스가 범위를 벗어났습니다.");
		
//		}
		
		try {
			System.out.println("배열의 크기를 입력해주세요");
			st=new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			int[] arr =new int[N];
			System.out.println("배열의 원소를 입력해주세요");
			st=new StringTokenizer(br.readLine());
			
			for(int i=0; i<arr.length; i++) {
				
				arr[i]= Integer.parseInt(st.nextToken());
			}
			int sum=0;
			for(int i: arr) {
				sum+=i;
			}
			System.out.println("평균:"+sum);
		}catch (InputMismatchException e) {
			System.out.println("배열의 크기입력을 해주세요");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 범위를 벗어났습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자만 입력해주세요.");
		}
		catch(NoSuchElementException e) {
			System.out.println("배열의 크기와 배열의 요소의 수가 다릅니다.");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("음수는 입력할 수 없습니다.");
		}
		

	}

}
