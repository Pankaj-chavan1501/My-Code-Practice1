package Array;

public class Array8 {
    /*Given an integer array arr of size n and an integer k, you need to pick exactly k elements from the array.
     *You can pick elements only from the beginning or the end of the array.
     *Return the maximum possible sum of the selected k elements.
     */
    public static int maxlenth(int[] arr, int k) {
        int leftsum = 0;
        int maxsum = 0;
        int rightsum = 0;
        for (int i = 0; i <= k - 1; i++) {
            leftsum = leftsum + arr[i];
            maxsum = leftsum;
        }

        int rightindx = arr.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftsum = leftsum - arr[i];
            rightsum = rightsum + arr[rightindx];
            rightindx = rightindx - 1;
            maxsum = Math.max(maxsum, leftsum + rightsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int max = maxlenth(arr, k);
        System.out.println(max);
    }
}

