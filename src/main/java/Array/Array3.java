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
    //optimised code of above problem

    public static String reverseString1(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }

    /*Given two strings txt and pat, return the 0-based index of the first occurrence of the substring pat in txt.
     *If pat is not found, return -1.
     * Note: You are not allowed to use the inbuilt function.
     * Examples :
     * Input: txt = "GeeksForGeeks", pat = "Fr"
     * Output: -1
     * Explanation: "Fr" is not present in the string "GeeksForGeeks" as substring.
     */
    public static int firstOccurence(String txt, String pat) {
        // code here
        String[] arr = txt.split(("(?=[A-Z])"));
        int len = 0;
        for (String num : arr) {
            if (num.equals(pat)) {
                return len;
            }
            len += num.length();
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "Geeks";
        String ans = reverseString1(input);
        System.out.println(ans);

        String txt = "GeeksForGeeks";
        String pat = "For";
        int o = firstOccurence(txt, pat);
        System.out.println(o);


    }

}
