package Array;

public class Array3 {
    /*You are given a string s, and your task is to reverse the string.
     *Examples:
     * Input: s = "Geeks"
     * Output: "skeeG"
     *
     */
    public static String reverseString(String s) {
        // code here
        int right = s.length() - 1;
        int left = 0;
        char[] ch = s.toCharArray();
        String newstring = " ";
        while (left <= right) {
            newstring += ch[right];
            right--;
        }
        return newstring;
    }

    public static String reverseString1(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        String input = "Geeks";
        String ans = reverseString1(input);
        System.out.println(ans);
    }

}
