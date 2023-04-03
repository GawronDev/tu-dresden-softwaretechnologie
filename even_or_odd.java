import java.util.ArrayList;

/* 
Create a function that takes an integer as an argument and returns "Even"
for even numbers or "Odd" for odd numbers. 
 */

public class even_or_odd {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add(0, even_or_odd_num(4));
        strings.add(0, even_or_odd_num(3));
        strings.add(0, even_or_odd_num(3));
        strings.add(0, even_or_odd_num(2));
        
        System.out.println(strings);
    }

    public static String even_or_odd_num(int number) {
        if(number % 2 == 0){
            return "Even";
        } else if (number % 2 != 0) {
            return "Odd";
        } else {
            return "None";
        }
    }
}

    