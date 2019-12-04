package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketSort {

	public static void main(String[] args) {

		int[] array = {54, 46, 83, 66, 95, 92, 43};
		
		Map<Integer, List<Integer>> hashmap = new HashMap<>();
		
		for(int i=0; i< array.length ; i++)
			put(hashmap , array[i]);
		
		System.out.println(hashmap.toString());
		
		int index = 0;
		for (Map.Entry<Integer, List<Integer>> entry : hashmap.entrySet()) {
			for(int i=0; i <entry.getValue().size(); i++)
				array[index++] = entry.getValue().get(i);
		}
		
		System.out.println(Arrays. toString(array));
	}
	
	private static void put(Map<Integer, List<Integer>> hashmap, Integer input) {
		
		List<Integer> list = new ArrayList<>();
		Integer key = input / 10;
		if (hashmap.get(key) == null) {
			list.add(input);
			hashmap.put(key, list);
		}
		else {
			list = hashmap.get(key);
			list.add(input);
			Collections.sort(list);
			hashmap.put(key, list);
		}
	}
	
}
