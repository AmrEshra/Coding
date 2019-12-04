package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
	public Employee(int key, String name) {
		this.key = key;
		this.name = name;
	}
	public String name;
	public Integer key;
}

public class Hashing {

	public static void main(String[] args) {

		Map<Integer, List<Employee>> hashmap = new HashMap<>();
		
		put(hashmap , 10%10, new Employee(10 , "Amr"));
		put(hashmap , 20%10, new Employee(20 , "Ali"));
		put(hashmap , 30%10, new Employee(30 , "Ahmed"));
		put(hashmap , 40%10, new Employee(40 , "Ola"));
		put(hashmap , 50%10, new Employee(50 , "Tarek"));
		put(hashmap , 6%10, new Employee(6 , "Tarek"));
		
		System.out.println(hashmap.toString());
		
		String name = get(hashmap , 60);
		System.out.println(name);
		
	}

	private static String get(Map<Integer, List<Employee>> hashmap, Integer key) {
		
		List<Employee> list = hashmap.get(key%10);
		if (list == null)
			return null;
		else {
			for(Employee employee : list) {
				if(employee.key.equals(key))
					return employee.name;
			}
		}
		return null;
	}

	private static void put(Map<Integer, List<Employee>> hashmap, int key, Employee input) {

		List<Employee> list = new ArrayList<>();
		if (hashmap.get(key) == null) {
			list.add(input);
			hashmap.put(key, list);
		}
		else {
			list = hashmap.get(key);
			list.add(input);
			hashmap.put(key, list);
		}
	}

}
