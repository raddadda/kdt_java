package java_generic;

import java.util.ArrayList;



class Pair<K,V> {

	private K key;
	private V value;
	
	public Pair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	
	public void K(K key) {
		System.out.print("Key: "+key);
	}
	public void V(V value) {
		System.out.println(", Value: "+value);
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	


}

public class GenericEx1 {

	//와일드카드
	public static void main(String[] args) {
		Pair<String,Integer> p = new Pair<>("One",1);
		Pair<Integer,String> p2 = new Pair<>(2,"Two");
		System.out.println("Key: "+p.getKey()+", Value: "+p.getValue());
		System.out.println("Key: "+p2.getKey()+", Value: "+p2.getValue());
		
	}

}
