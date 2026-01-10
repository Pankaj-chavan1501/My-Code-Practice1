package String;

public class String4 {
    /*You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version
     *of the string s1.
     *Note: A string is a rotation of another if it can be formed by moving characters from the start
     *  to the end (or vice versa) without rearranging them.

     * Examples :
     * Input: s1 = "abcd", s2 = "cdab"
     * Output: true
     * Explanation: After 2 right rotations, s1 will become equal to s2.
     */

    // brute force solution tc is O(N^2) and  sc is O(N).
    public static boolean areRotationsBruteSplit(String s1, String s2) {

        // STEP 1:
        // If lengths are different, s2 can never be a rotation of s1
        if (s1.length() != s2.length()) {
            return false;
        }

        // STEP 2:
        // Store the length of the string
        // We will try all possible rotations from 0 to n-1
        int n = s1.length();

        // STEP 3:
        // Loop through each possible rotation index
        for (int i = 0; i < n; i++) {

            /*
             * CORE ROTATION LOGIC:
             *
             * substring(i)      → gives characters from index i till the end
             * substring(0, i)   → gives first i characters (index 0 to i-1)
             *
             * substring(start, end):
             * - start index is INCLUDED
             * - end index is EXCLUDED
             *
             * Example:
             * s1 = "abcd"
             * i = 2
             *
             * s1.substring(2)    → "cd"
             * s1.substring(0,2)  → "ab"
             *
             * rotated = "cd" + "ab" → "cdab"
             *
             * This means:
             * we cut the string at index i
             * and move the left part to the end
             */

            String rotated = s1.substring(i) + s1.substring(0, i);

            // STEP 4:
            // Check if the rotated string is equal to s2
            if (rotated.equals(s2)) {
                return true; // rotation found
            }
        }

        // STEP 5:
        // After trying all rotations, no match found
        return false;
    }

    // optimised code TC is O(N) and SC is O(N)
    public static boolean areRotationsOptimized(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String rotate = s1 + s1;
        return rotate.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        Boolean brute = areRotationsBruteSplit(s1, s2);
        System.out.println(brute);
        Boolean opt = areRotationsOptimized(s1, s2);
        System.out.println(opt);


    }

}

