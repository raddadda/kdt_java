package codingtest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ex1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[] nums1 = {2,5,8,3,7};
//		int N = Integer.parseInt(br.readLine());
//		int sum= 0;
//		for(int i=0; i<nums1.length; i++) {
//			if(nums1[i] <=N) {
//				sum+=nums1[i];
//			}
//		}
//		System.out.println(sum);
		
		int[] num2 = {3,2,4,3,6,8,5};
		
		int target2 = 9;
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<num2.length; i++) {
			for(int j=i-1; j<num2.length; j++) {
				//list.add(num2[i]+num2[j]);
			}
		}
		
		for(int a: list) {
			if(a == target2) {
				System.out.println(a);
			}
		}
	}

}
