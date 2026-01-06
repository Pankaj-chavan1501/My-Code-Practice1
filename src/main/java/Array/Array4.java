package Array;

public class Array4 {
    /* reverse array

     */
    //brute force code tc is  is O(n) ,  ans sc is O(n) because we have created extra array
    public static int[] reverseArray(int[] arr) {
        int[] an = new int[arr.length];
        int p = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            an[p] = arr[i];
            p++;
        }
        return an;
    }

    //optimised tc and sc is O(n),O(1)
    public static int[] reverseArrayoptmised(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] k = reverseArrayoptmised(arr);
        for (int num : k) {
            System.out.println(num);
        }
    }
}
