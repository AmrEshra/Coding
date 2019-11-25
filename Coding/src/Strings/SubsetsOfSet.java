package Strings;

import java.util.*;


public class SubsetsOfSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<List<Integer>> sets = subsets(new Integer[]{1 , 3 , 4 , 6});
		System.out.println(Arrays.toString(sets.toArray()));
		
//		List<List<String>> sets = subsets(new String[]{"A" , "B" ,"D" ,"C"});
//		System.out.println(Arrays.toString(sets.toArray()));

	}
	
	public static List<List<String>> subsets(String[] S) {
        ArrayList<List<String>> res = new ArrayList<List<String>>();
        if(S.length == 0){
            res.add(new ArrayList<String>());
            return res;
        }
        Arrays.sort(S);
        String head = S[0];
        String[] rest = new String[S.length-1];
        System.arraycopy(S, 1, rest, 0, S.length-1);
        for(List<String> list : subsets(rest)){
            List<String> newList = new LinkedList<String>();
            newList.add(head);
            newList.addAll(list);
            res.add(list);
            res.add(newList);
        }
        return res;
    }

	public static List<List<Integer>> subsets(Integer[] S) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(S.length == 0){
            res.add(new ArrayList<Integer>());
            return res;
        }
        Arrays.sort(S);
        Integer head = S[0];
        Integer[] rest = new Integer[S.length-1];
        System.arraycopy(S, 1, rest, 0, S.length-1);
        for(List<Integer> list : subsets(rest)){
            List<Integer> newList = new LinkedList<Integer>();
            newList.add(head);
            newList.addAll(list);
            res.add(list);
            res.add(newList);
        }
        return res;
    }
	
}
