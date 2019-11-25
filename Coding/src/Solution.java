import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String[] words = ("breakfast beach citycenter location metro view staff price").split(" ");
        
        int noOfReviews = 1;
        System.out.println(noOfReviews);
        
        HashMap<Integer,Integer> hotels = new HashMap<Integer,Integer>();
        
        for (int i = 0 ; i < noOfReviews ; i++){
            int hotelId = 1;
            if (!hotels.containsKey(hotelId))
                hotels.put(hotelId,0);
            
            String[] review = ("This hotel has a nice view of the citycenter. The location is perfect staff").split(" ");
            
            for (int j = 0 ; j < words.length ; j++){
                
                 for (int k = 0 ; k < review.length ; k++){
                     
                     if (words[j].equals(review[k])){
                         int count = hotels.get(hotelId) + 1;
                         hotels.put(hotelId,count);
                     }                 
                 }
            }
        }
        System.out.println(hotels.get(1));
        
    }
}
