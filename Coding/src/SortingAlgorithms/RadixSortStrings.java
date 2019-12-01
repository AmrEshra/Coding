package SortingAlgorithms;

import java.util.Arrays;

public class RadixSortStrings {

    public static void main(String[] args) {

//        String[] radixArray = {"bcdef" , "dbaqc", "abcde", "omadd", "bbbbb"};
      String[] radixArray = {"aa" , "k", "c"};
      
      Arrays.sort(radixArray);

      String input = "azbc".toLowerCase(); //note the to lower case in order to treat a and A the same way
      for( int i = 0; i < input.length(); ++i) {
         int position = input.charAt(i) - 'a' + 1;
         System.out.println(position);
      }
      
       // radixSort(radixArray, 28, 5);

        System.out.println(Arrays.toString(radixArray));
    }

 /*   public static void radixSort(String[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {

//        String str = "DEFGHIA";
//        char[] ch  = str.toCharArray();
//        for(char c : ch){
//            int temp = (int)c;
//            int temp_integer = 64; //for upper case
//            if(temp<=90 & temp>=65)
//                System.out.println(temp-temp_integer);
//        }
        
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input) {
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }*/

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

}
