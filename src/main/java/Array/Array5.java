package Array;

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
    public static  int reducingWalls(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] agrs) {
        int arr[] = {5, 3, 2, 6, 8};
        int k = 5;
        int m = reducingWalls(arr, k);
        System.out.println(m);
        System.out.println(m);

    }

}
