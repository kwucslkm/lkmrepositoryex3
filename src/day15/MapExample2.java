package day15;

import java.util.*;

public class MapExample2 {

	public static void main(String[] args) {
		//
		Map<String, String> map2 = new HashMap<>();
		map2.put("첫번째", "java");
		map2.put("두번째", "mysql");
		map2.put("세번째","spring");
		System.out.println(map2.get("두번째"));
		map2.remove("세번째");

		for(String key: map2.keySet()) {
			System.out.println(key);
			System.out.println(map2.get(key));
			
		}
	}

}
