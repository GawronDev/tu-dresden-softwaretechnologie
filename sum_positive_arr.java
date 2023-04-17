/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

public class sum_positive_arr {
    public static void main(String[] args) {
        int arr[] = {1,-4,7,12};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int argument : arr){
            if(argument > 0){
                sum += argument;
            }
        }
        return sum;
    }
}
