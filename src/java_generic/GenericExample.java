package java_generic;
import java.util.*;

//일반 클래스
class MyCustomList {
	ArrayList<String> list = new ArrayList<>();
	public void addElement(String element) {
		list.add(element);
	}
	public void removeElement(String element) {
		list.remove(element);
	}
}

//제네릭 클래스
class MyCustomListGeneric<T>{
	ArrayList<T> list = new ArrayList<>();
	public void addElement(T element) {
		list.add(element);
	}
	public void removeElement(T element) {
		list.remove(element);
	}
	public T get(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}
}

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomList list = new MyCustomList();
		list.addElement("element");
		
		MyCustomListGeneric<Integer> list2 = new MyCustomListGeneric<>();
		list2.addElement(1);
		list2.addElement(2);
		list2.addElement(3);
		Integer text  = list2.get(2);
		System.out.println(text);
		
//		GenericExample3 example = new GenericExample3();
//		ArrayList<Integer> integerList = new ArrayList<>();
//		integerList.add(1);
//		integerList.add(2);
//		integerList.add(3);
//		
//		ArrayList<Double> doubleList = new ArrayList<>();
//		doubleList.add(1.1);
//		doubleList.add(2.1);
//		doubleList.add(3.1);
//		
		//와일드카드 <? extends T> 은 읽기전용을 주로 사용
		//example.processList();
	}


}
