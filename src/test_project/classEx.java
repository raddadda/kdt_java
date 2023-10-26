package test_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class classEx {
		//private static int cnt =0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		ArrayList<classEx2> rec = new ArrayList<>();

//		
//		rec.setW(rW);
//		rec.setH(rH);

		
		while(true) {
			
			System.out.println("가로 세로를 입력해주세요.");
			StringTokenizer st = new StringTokenizer(br.readLine());;
			 int rW = Integer.parseInt(st.nextToken());
			 int rH = Integer.parseInt(st.nextToken());
			 classEx2 rec2 = new classEx2(rW,rH);
			if(rW==0 && rH==0) {
				for(classEx2 c : rec) {
					sb.append("가로 길이는 : "+c.getW()).append('\n');
					sb.append("세로 길이는 : "+c.getH()).append('\n');
					sb.append("넓이는 : "+c.area()).append('\n');
					sb.append("---------------").append('\n');
					
				}
				System.out.println(sb);
				System.out.println("Rectangle 인스턴스의 개수는 : "+rec2.getCount());
				break;
			}
			
			rec.add(rec2);
			//cnt++;
			
		}
		
		
		
		
	
	
	}
}
