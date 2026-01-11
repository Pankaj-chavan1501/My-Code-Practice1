package String;

import java.util.LinkedHashSet;

public class String5 {
    /*Given a string s without spaces, the task is to remove all duplicate characters from it,
     *keeping only the first occurrence.
     * Note: The original order of characters must be kept the same.
     *
     *Examples :
     * Input: s = "zvvo"
     * Output: "zvo"
     * Explanation: Only keep the first occurrence
     *
     */
    public static String removeDups(String s) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            boolean find = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == current) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                stb.append(s.charAt(i));

            }
        }
        return stb.toString();
    }

    //optimised solution
    public static String removeDups1(String s) {
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
        String intout = "zvvo";
        String k = removeDups1(intout);
        System.out.println(k);
    }
}