/*
Implement a function which convert the given boolean value into its string representation.
Note: Only valid inputs will be given.
 */

public class convert_bool_to_str {
    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
    }

    public static String convert(boolean b) {
        // Use a turnary for convertion
        return b ? "true" : "false";
    }
}
