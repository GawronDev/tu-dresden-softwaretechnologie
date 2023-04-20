/*
The goal of this exercise is to convert a string to a new string where each character in the
new string is "(" if that character appears only once in the original string, or ")" if that
character appears more than once in the original string. Ignore capitalization when determining
if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
Notes
Assertion messages may be unclear about what they display in some languages. If you read
...It Should encode XXX, the
XXX is the expected result, not the input!
*/

import java.util.ArrayList;

public class duplicate_encoder {
    public static void main(String[] args) {
        System.out.println(encode("recede"));
    }

    static String encode(String word) {
        word = word.toLowerCase();
        int len = word.length();
        ArrayList<String> characters = new ArrayList<String>();
        ArrayList<String> appear_more = new ArrayList<String>();

        // Checking what characters appear more than once
        for(int i = 0; i < len; i++){
            if(characters.contains(String.valueOf(word.charAt(i))) == false){
                characters.add(String.valueOf(word.charAt(i)));
            } else {
                appear_more.add(String.valueOf(word.charAt(i)));
            }
        }

        // Encoding part
        String encoded = "";
        for(int i = 0; i < len; i++){
            if(appear_more.contains(String.valueOf(word.charAt(i)))){
                encoded = encoded + ")";
            } else {
                encoded = encoded + "(";
            }
        }
        return encoded;
    }
}