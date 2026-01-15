package Array;

public class Array7 {
    //L1. Introduction to Sliding Window and 2 Pointers | Templates | Patterns
// this is brut forcr solution.
    public static int kthElement(int a[], int k) {
        int maxlnth = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < a.length - 1; j++) {
                sum = sum + a[j];
                if (sum <= k) {
                    maxlnth = Math.max(maxlnth, j - i + 1);

                } else if (sum > k) {
                    break;

                }
            }
        }
        return maxlnth;
    }

    //better approach tc is O(N+N),and sc is O(1);
    public static int maxsumoflenth(int[] a, int k) {
        int l = 0;
        int r = 0;
        int n = a.length;
        int sum = 0, maxlenth = 0;
        while (r < n - 1) {
            sum = sum + a[r];
            while (sum > k) {
                sum = sum - a[l];
                l++;
            }
            if (sum <= k) {
                maxlenth = Math.max(maxlenth, r - l + 1);
            }
            r++;

        }
        return maxlenth;
    }
    // optimal solution
    public static int maxsumoflenth1(int[] a, int k) {
        int l=0,r=0,sum=0,maxlength=0;
        int n=a.length;
        while (r<n){
            sum=sum+a[r];
            if(sum>k){
                sum=sum-a[l];
                l++;
            }
            if(sum<=k){
                maxlength=Math.max(maxlength,r-l+1);
            }
            r++;
        }
        return maxlength;
    }


        public static void main(String[] args) {
        int a[] = {2, 5, 1, 7, 10};
        int k = 14;
        int find = maxsumoflenth1(a, k);
        System.out.println(find);
    }
}
