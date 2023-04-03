import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class reverse_random_list {
    public static void main(String[] args) {
        // Populate an array of integers with random numbers then reverse it and sum the values
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // Have the array be random size
        int size_of_array = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        for(int i = 0; i < size_of_array; i++){
            // Adds random ints to the array
            nums.add(ThreadLocalRandom.current().nextInt(0, 100 + 1));
        }
        
        System.out.println(nums);
        
        // Reverse the list using an algorithm, not a build in function
        int last_elem_index = nums.size() - 1;
        int curr_index = 0;
        while(last_elem_index != curr_index || last_elem_index < curr_index){
            Collections.swap(nums, curr_index, last_elem_index);
            curr_index++; last_elem_index--;
        }

        System.out.println(nums);
    }
}
