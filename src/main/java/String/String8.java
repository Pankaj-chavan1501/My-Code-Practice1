package String;

public class String8 {
    /* Given a text and a pattern, the task is to check if the pattern exists in the text or not.
     *Example 1:
     * Input: text = "geeksforgeeks"
     * pat = "geek"
     * Output: 1
     * Explanation: "geek" exists in"geeksforgeeks"
     */
    public static int search(String text, String pat) {
        // code here
        if (text.contains(pat)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pat = "gfg";
        int k = search(text, pat);
        System.out.println(k);

    }
}
