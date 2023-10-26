package test_project;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("안녕하세요");
//		System.out.printf("%d",10).println();
		
		Scanner scanner = new Scanner(System.in);
		//scanner.close();
		//String name = scanner.nextLine();
		//형식지정자//
		//d정수 f실수 s문자열 c문자 bboolean
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력하세요");
		String name= br.readLine();
		System.out.println("나이를 입력하세요");
		int age= Integer.parseInt(br.readLine());

		System.out.printf("안녕하세요! %s님 (%d세)",name,age);
	
//		System.out.println("안녕하세요! "+name+"님 ("+age+")");
		
		
		
	}

}
