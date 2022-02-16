package com.KJH.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		//GtList<Integer> list = new GtList<>();
		//가변길이용
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		int size = list.size();
		System.out.println(list.get(0));
		System.out.printf("size : %d\n", size);

		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		
		//중복제거용
		Set<Integer> set = new HashSet<>();
		
		set.add(7);
		set.add(3);
		set.add(4);
		set.add(7);
		set.add(7);
		set.add(7);
		
		System.out.println(set.size()); //이미 있는 값은 받아지지 않는다. 값 자체가 식별자.
		
		list.add(7);
		list.add(3);
		list.add(4);
		
		list.add(7);
		list.add(3);
		list.add(4);
		int size2 = list.size(); //Object -> Integer :참조를 다른 참조로 바꾸는 것.
		System.out.printf("size2 : %d\n", size2);
//		num = list.get(1);
		
		//특성과 값으로 구분된 데이터를 필요로할 시
		Map<String, Object> map = new HashMap<>();
		map.put("id", 3);
		map.put("title", "Hello");
		map.put("writer", "JH");
		
		System.out.println(map.get("title"));
	}

}
