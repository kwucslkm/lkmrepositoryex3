package day15;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1 = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		
		map1.put(1, "안녕하세요");
		String val2 = map1.put(2, "안녕");
		System.out.println(val2);
		System.out.println(map1.put(2, "bangga"));
		
		String val1 = map1.get(1);
		System.out.println(val1);
		map1.remove(2);
		System.out.println(map1.get(2));
		for(int keys : map1.keySet()){
			System.out.println(keys);
			System.out.println(map1.get(keys));
		}
		

	}

}
//int[] array1 = new int[10];
