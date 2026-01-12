package String;

public class String7 {
    /* You are given a string s, consisting of lowercase alphabets. Your task is to remove consecutive duplicate characters from the string.
     *
     * Example:
     * Input: s = "aabb"
     * Output:  "ab"
     * Explanation:
     * The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.
     * Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed.
     * The final string is "ab".
     */
//optimised  solution TC is O(N) and  SC is O(N) because we used StrinBuilder.
    public static String removeConsecutiveCharacter(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                str.append(s.charAt(i));
            }

        }
        return str.toString();

    }

    public static void main(String[] args) {
        String st = "aabb";
        String k = removeConsecutiveCharacter(st);
        System.out.println(k);
    }
}


