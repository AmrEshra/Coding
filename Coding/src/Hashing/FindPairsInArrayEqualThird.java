package Hashing;

import java.util.HashMap;

public class FindPairsInArrayEqualThird {
    
	public static void main(String[] args) {

		int arr[] = {3, 4, 7, 1, 2, 9, 8};
        findPairs(arr);
	}

	public static boolean findPairs(int arr[])
    {
        // Create an empty Hash to store mapping from sum to
        // pair indexes
        HashMap<Integer,Pair> map = new HashMap<Integer,Pair>();
        int n=arr.length;
 
        // Traverse through all possible pairs of arr[]
        for (int i=0; i<n; ++i)
        {
            for (int j=i+1; j<n; ++j)
            {
                // If sum of current pair is not in hash,
                // then store it and continue to next pair
                int sum = arr[i]+arr[j];
                if (!map.containsKey(sum)){
                	Pair pair = new Pair();
                    map.put(sum,pair);
                }
 
                else // Else (Sum already present in hash)
                {
                    // Find previous pair
                	Pair p = map.get(sum);
 
                    // Since array elements are distinct, we don't
                    // need to check if any element is common among pairs
                    System.out.println("("+arr[p.first]+", "+arr[p.second]+
                                      ") and ("+arr[i]+", "+arr[j]+")");
                    return true;
                }
            }
        }
        return false;
    }

	
}
