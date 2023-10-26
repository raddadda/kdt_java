package test_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;
public class ArrListEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<String> list = new ArrayList<>();
		
		String str= "";

		while(true) {
			System.out.println("문자를 입력해주세요. :");
			str = br.readLine();
			if(str.equals("exit")) {break;}
			list.add(str);
		}
		
		for(String s : list) {
			sb.append(s).append('\n');
		}
		System.out.print(sb);
	}

}
