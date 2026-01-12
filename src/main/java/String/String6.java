package String;

import java.util.LinkedHashSet;

public class String6 {
    /*Given a string s which may contain lowercase and uppercase characters. The task is to remove all
     *duplicate characters from the string and find the resultant string. The order of remaining characters
     *  in the output should be same as in the original string.
     *
     *Example 1:
     * Input: s = "geEksforGEeks"
     * Output: "geEksforG"
     * Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".
     *
     */
    //brute force solution
    public static String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean find = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == ch) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                str.append(ch);
            }
        }
        return str.toString();
    }

    //optimise solution
    public static String removeDuplicates1(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (char ch : set) {
            str.append(ch);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String input = "geEksforGEeks";
        String output = removeDuplicates(input);
        System.out.println(output);
    }
}
