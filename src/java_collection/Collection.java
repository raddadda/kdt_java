package java_collection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Collection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
//		List<String> arrayList = new ArrayList<>();
//		//LinkedList
//		List<String> linkedList = new LinkedList<>();
//		linkedList.add("A");
//		System.out.println(linkedList);
//		Set<String> hashSet = new HashSet<>();
//		hashSet.add("A");
//		System.out.println(hashSet);
		//넣은 순서대로 나온다.
//		Set<String> linkedHashSet = new LinkedHashSet<>();
//		linkedHashSet.add("C");
//		linkedHashSet.add("B");
//		linkedHashSet.add("A");
//		System.out.println(linkedHashSet);
//		//TreeSet 자동 정렬을 한다.
//		Set<String> treeSet = new TreeSet<>();
//		treeSet.add("B");
//		treeSet.add("C");
//		treeSet.add("A");
//		System.out.println(treeSet);
		
//		//HashMap
//		Map<String,Integer> hashMap = new HashMap<>();
//		hashMap.put("one", 1);
//		hashMap.put("two", 2);
//		hashMap.put("three", 3);
//		
//		//LinkedHashMap 순서대로
//		Map<String,Integer> link = new LinkedHashMap<>();
//		link.put("two", 2);
//		link.put("one", 1);
//		link.put("three", 3);
//		
//		//TreeMap 정렬해서
//		Map<String,Integer> treeMap = new TreeMap<>();
//		link.put("two", 2);
//		link.put("one", 1);
//		link.put("three", 3);
		
		//실습1
		Set<Integer> hashSet2 = new HashSet<>();
		while(true) {
			System.out.println("정수를 입력해주세요");
			int N = Integer.parseInt(br.readLine());
			if(N == -1) {
				System.out.println(hashSet2);
				break;
			}
			hashSet2.add(N);
			
		}
		
//		//실습2
//		HashMap<String,Integer> map = new HashMap<>();
//		
//		while(true) {
//			System.out.println("이름을 적어주세요");
//			String name =br.readLine();
//			if(name.equals("종료")) {
//				System.out.println(map);
//				break;
//			}
//			System.out.println("나이를 적어주세요");
//			int age = Integer.parseInt(br.readLine());
//			map.put(name,age);
//		}
		
	}

}
