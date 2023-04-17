/*
Your task is to make a function that can take any non-negative integer as an argument
and return it with its digits in descending order. Essentially, rearrange the digits to
create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
 */

import java.util.Arrays;
import java.util.Collections;

public class highest_possible {
    public static void main(String[] args) {
        System.out.println(sortDesc(68596895));
    }

    private static int sortDesc(final int num) {
        int sum = 0; // Sum that will be returned later
        int length = String.valueOf(num).length(); // Number of digits
        char[] charArr = String.valueOf(num).toCharArray(); // Array of digits as chars
        
        Integer[] intArr = new Integer[length]; // Populate the array with ints
        for(int i =0; i < length; i++){
            intArr[i] = Integer.parseInt(String.valueOf(charArr[i]));
        }
        Arrays.sort(intArr, Collections.reverseOrder()); // Sorts the array in the descending order

        for(int i =0; i < length; i++){ // A loop for getting the sum
            sum = sum*10 + intArr[i];
        }
        return sum;
    }

}
