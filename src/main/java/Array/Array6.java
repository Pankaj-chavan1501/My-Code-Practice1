package Array;

public class Array6 {
    /*Given an array arr of non-negative integers, return the maximum product of two numbers possible.
     *Example:
     * Input: arr[] = [1, 4, 3, 6, 7, 0]
     * Output: 42
     * Explanation: 6 and 7 have the maximum product.
     */
    //brute force tc is O(n^2) and sc is O(1).
    public static int maxProduct(int[] arr) {
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] * arr[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }

    //optimised Solution tc is O(n) and sc is O(1).
    public static int maxProduct1(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            //find two smallest
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;

            }
        }
        return Math.max(max1 * max2, min1 * min2);
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 0};
        int max = maxProduct1(arr);
        System.out.println(max);
    }


    }
