package String;

public class String2 {
    /* Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.
     *Note: If '1' is not present, return "-1"

     *Examples:
     *Input: s = 00001
     *Output: 4
     * Explanation: Last index of  1 in given string is 4.
     */
    //brute force
    public static int lastIndex(String s) {
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                last = i;
            }
        }
        return last;
    }

    //optimised solution
    public static int lastIndex1(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "0000000001";
        int m = lastIndex(s);
        System.out.println(m);
    }
}
