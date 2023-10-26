package java_generic;

import java.util.ArrayList;

public class GenericExample3 {
	//와일드카드
	public void processList(ArrayList<? extends Number> list) {
		//list.add(1);
		for(Number num: list) {
			System.out.println(num);
		}
	}
	//타입스크립트
	public <T extends Number> void addToNumberList(ArrayList<T> list, T item) {
		list.add(item);
	}
	//? super T
	public void processList2(ArrayList<? super Integer> list) {
		list.add(1);
	}
	public static void main(String[] args) {

		
		GenericExample3 example = new GenericExample3();
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(1.1);
		doubleList.add(2.1);
		doubleList.add(3.1);
		
		//와일드카드 <? extends T> 은 읽기전용을 주로 사용
		example.processList(integerList);
		example.processList(doubleList);
		example.addToNumberList(integerList, 4);
		example.addToNumberList(doubleList, 4.4);
		
		
	}
}
