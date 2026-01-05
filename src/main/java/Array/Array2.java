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
    public static void main(String[]args){
        int key = 2;
        int[] arr = {10, 20, 30, 40, 50};
        int k = findElementAtIndex(key, arr);
        // System.out.println(k);

        List<String> list = new ArrayList<>(Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"));
        String now = longest(list);
        System.out.println(now);
    }
    }
