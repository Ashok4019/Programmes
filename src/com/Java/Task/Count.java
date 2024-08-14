package com.Java.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Count {

	public static void main(String[] args) {

		String[] arr = { "a", "b", "c", "d", "a", "b", "c", "a" };

		Map<String, Integer> map = new HashMap();

		for (String m : arr) {
			if (map.containsKey(m)) {
				map.put(m, map.get(m) + 1);
			} else {
				map.put(m, 1);
			}
		}
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() % 2 != 0) {
				System.out.println(entry.getKey() + entry.getValue());
			}
		}
	}

}
