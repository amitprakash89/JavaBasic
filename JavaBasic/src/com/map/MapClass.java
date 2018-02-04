package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		map.put("2222", "ghi");
		map.put("3333", "abc");
		map.put("1111", "def");
		String s1 = map.get("3333");
		String s2 = map.get("9999");
		String s3 = map.getOrDefault("9999", "xyz");
	
		map.forEach( (k, v) -> System.out.println(k + " | " + v));
		map.replaceAll( (k, v) -> v.toUpperCase());
		map.forEach( (k, v) -> System.out.println(k + " | " + v));
		System.out.println(s2);
	}

}
