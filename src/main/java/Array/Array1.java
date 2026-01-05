package Array;

import java.util.ArrayList;

public class Array1 {
    /*You are given an array arr(0-based index) and two positive integer index and val.
     *You need to insert an val at given index.
     * Examples:
     * Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
     * Output: 1 2 3 4 5 90
     * Explanation: 90 is inserted at index 5(0-based indexing). After inserting,array elements are like [1, 2, 3, 4, 5, 90].
     *
     */

    // Brute Force Code
    public static void insertAtIndex1(ArrayList<Integer> arr, int index, int val) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i == index) {
                result.add(val);
            }
            result.add(arr.get(i));
        }
        // if index == size (insert at end)
        if (index == arr.size()) {
            result.add(val);
        }
        arr.clear();
        arr.addAll(result);
    }

    //optimised solution

    public static void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        if (index < 0 || index > arr.size()) {
            return;
        }
        arr.add(0);
        for (int i = arr.size() - 1; i > index; i--) {
            arr.set(i, arr.get(i - 1));
        }
        arr.set(index, val);
    }

    /*Given an array of arr[] positive integers where all numbers occur even number of times except one number which
     *occurs odd number of times. Return that number.
     *Examples:
     * Input:arr[] = [1, 2, 3, 2, 3, 1, 3]
     * Output: 3
     * Explaination: 3 occurs three times.
     */
    //Brute force code
    public static int getOddOccurrence(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if ((count / 2) * 2 != count) {
                return arr[i];
            }
        }
        return -1;
    }

    //optimised solution
    public static int getOddOccurrence1(int[] arr) {
        int i = 0;
        int result = 0;
        int r = arr.length;

        while (i < r) {
            result = result ^ arr[i];
            i++;
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> at = new ArrayList<Integer>();
        at.add(1);
        at.add(2);
        at.add(3);
        at.add(4);
        at.add(5);
        insertAtIndex(at, 2, 90);
        System.out.println(at);

        int arr[] = {1, 2, 3, 2, 3, 1, 3};
        int k = getOddOccurrence1(arr);
        System.out.println(k);

    }
}
