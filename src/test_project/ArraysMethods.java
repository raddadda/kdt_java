package test_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {1,2,3,4,5};
			//특정 길이 만큼 복사한 새 배열을 반
			int[] newArr = Arrays.copyOf(arr,4);
			System.out.println(Arrays.toString(newArr));
			
			int[] newArr2 = Arrays.copyOfRange(arr,2,4);
			System.out.println(Arrays.toString(newArr2));
			
			//fill:배열의 모든 요소를 주어진 값으로 채
			Arrays.fill(arr,10);
			System.out.println(Arrays.toString(arr));
			
			int[] arr2 = new int[5];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			Arrays.fill(arr2,3,arr2.length,100);
			System.out.println(Arrays.toString(arr));
			
			//sort
			Integer[] arr3 = {3,2,4,5,1};
			Arrays.sort(arr3,Collections.reverseOrder());
			for(Integer a : arr3) {
				System.out.print(a);
			}
			//int[] reverseArr=new int[5];
//			for(int i=arr3.length-1, j=0; i>=0;i--,j++) {
//				reverseArr[j]= arr3[i];
//				
//			}
			//Arrays.sort(arr3,Collections.reverseOrder());
			//Arrays.sort(arr3, (o1, o2) -> o1[0] - o2[0]); 
			//Arrays.sort(arr,(x,y)->y-x);
			//eqauls : 두 배열이 같은지 여부 확인
			int[] arr4 = {1,2,3,4,5};
			//deepEqual : 다차원 배열 비교
			
			//binarySearch
			//해당값몇번째 인덱스에 있는지 찾기
			int index = Arrays.binarySearch(arr3,2);
	}

}
