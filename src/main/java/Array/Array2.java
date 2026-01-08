package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2 {
    /* Given an array arr of integers and an index key(0-based index).
     *Your task is to return the element present at the index key in the array.
     *
     *
     *Examples:
     * Input: key = 2 , arr = [10, 20, 30, 40, 50]
     * Output: 30
     * Explanation: The value of arr[2] is 30 .
     */
    // brute force code
    public static int findElementAtIndex(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == key) {
                return arr[i];
            }
        }
        return -1;
    }

    //optimised solution
    public static int findElementAtIndex1(int key, int[] arr) {
        if (key >= 0 && key < arr.length) {
            return arr[key];
        }
        return -1;
    }


    public static String longest(List<String> arr) {
        // code here
        int count = 0;
        String longestStr = " ";

        for (int i = 0; i < arr.size(); i++) {
            String k = arr.get(i);
            int len = k.length();
            if (len > count) {
                count = len;
                longestStr = k;
            }
        }
        return longestStr;
    }
    /* Given an alphanumeric string s,return the second  largest numerical digit that appears in s, or -1
     *if it An alphanymeric string is a string consisting of lowercase English letter and digits.
     *
     * Example 1:
     * Input :s="dfa12321afd"
     * Explanation: The digits that appear in s are [1,2,3].the second largest digit 2
     */

    public static int secondHighest(String s) {
        int largest = -1;
        int secondlargest = -1;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                if (num > largest) {
                    secondlargest = largest;
                    largest = num;
                } else if (num < largest && num > secondlargest) {
                    secondlargest = num;
                }
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int key = 2;
        int[] arr = {10, 20, 30, 40, 50};
        int k = findElementAtIndex(key, arr);
        // System.out.println(k);

        List<String> list = new ArrayList<>(Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"));
        String now = longest(list);
        System.out.println(now);

        String s = "dfa12321afd";
        int m = secondHighest(s);
        System.out.println(m);


    }
}
