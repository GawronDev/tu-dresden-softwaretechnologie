/*

An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false

*/
import java.util.ArrayList;

public class is_isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
    }

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        int len = str.length();
        ArrayList<String> characters = new ArrayList<String>();

        // Checking what characters appear more than once, if yes retrun false, if not return true
        for (int i = 0; i < len; i++) {
            if (characters.contains(String.valueOf(str.charAt(i))) == false) {
                characters.add(String.valueOf(str.charAt(i)));
            } else {
                return false;
            }
        }
        return true;
    }
}
