package Array;

import java.util.HashMap;
import java.util.Map;

public class Array5 {
    /*You are given an array arr and an integer k. In one operation you can choose any element of array and decrease its value by k.
     *You need find the minimum number of operation such that all the elements in the array becomes less or equal to k.
     *
     *
     * Examples:
     * Input: arr[] = [5, 3, 2, 6, 8] and k = 5
     * Output: 2
     * Explanation: Ishaan can climb a wall with height atmost 5. So he climbs the first 3 walls easily. Now he has to use his power to
     * reduce the height of the 4th wall. After using his power, Now to climb the last wall, he again uses his power.
     *
     *
     */
    public static int reducingWalls(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k) {
                int excess = arr[i] - k;
                count += (excess + k - 1) / k;
            }
        }
        return count;
    }

    /*  twosum
     *Given an array arr[] of n integers and a target value, check if there exists a pair whose sum equals the target.
     */
    //brute force code tc is O(n) and sc is O(1) because you  have not used  extra dat structure.
    public static int[] twosum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    //optimised solution tc is O(n) and sc is O(n) because you  have  used  extra data structure. which is  HashMap
    public static int[] twosum1(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = target - arr[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] agrs) {
        int arr[] = {5, 3, 2, 6, 8 ,14};
        int k = 5;
        int m = reducingWalls(arr, k);
        //System.out.println(m);

        int arr1[] = {0, -1, 2, -3, 1};
        int target = -2;
        int[] kam = {2, 11, 15, 17, 7};
        int t = 9;
        int[] at = twosum1(arr1, target);
        for (int num : at) {
            System.out.println(num);
        }
    }

}
