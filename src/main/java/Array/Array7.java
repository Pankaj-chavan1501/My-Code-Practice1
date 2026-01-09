package Array;

import java.util.ArrayList;

public class Array7 {
    /* Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray
     *(a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based
     * indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is
     *  equal to the target.
     * Note: If no such array is possible then, return [-1].
     *
     * example
     * Input: arr[] = [1, 2, 3, 7, 5], target = 12
     * Output: [2, 4]
     * Explanation: The sum of elements from 2nd to 4th position is 12.
     */

    // this problem solve with array as return type
    public static int[] subarraySum(int[] arr, int target) {
        int sum = 0;
        int i = 0;
        int N = arr.length;
        int j = 0;
        while (i < N) {
            // expand window
            sum += arr[j];
            // shrink window if sum exceeds target
            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }
            // check target

            if (sum == target) {
                // return 1-based indices
                // return 1-based indices

                return new int[]{i + 1, j + 1};
            }
            j++;
        }
        return new int[]{};

    }

    // solving with ArrayList as return type
    public static ArrayList<Integer> subarraySum1(int[] arr, int target) {
        ArrayList<Integer> my = new ArrayList<>();
        int sum = 0;
        int i = 0;
        int j = 0;
        int N = arr.length;
        while (j < N) {
            sum += arr[j];
            while (sum > target && i <= j) {
                sum -= arr[i];
                i++;
            }
            if (sum == target) {
                my.add(i + 1);
                my.add(j + 1);
                return my;
            }
            j++;
        }
        my.add(-1);
        return my;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;
        int[] newar = subarraySum(arr, target);
        for (int num : newar) {
            System.out.println(num);
        }
        ArrayList<Integer> mylist = subarraySum1(arr, target);
        System.out.println(mylist);
    }
}
