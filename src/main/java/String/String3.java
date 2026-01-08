package String;

public class String3 {
    /*Given a string s. The task is to convert string characters to lowercase.

     *Examples:
     *Input: s = "ABCddE"
     *Output: "abcdde"
     *Explanation: A, B, C and E are converted to a, b, c and e thus all uppercase characters of the string converted to lowercase letter.

     */
    //brute force tc is O{N^2) and O(N);
    public static String toLower(String s) {
        String newString = " ";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                newString += Character.toLowerCase(s.charAt(i));
            } else if (Character.isLowerCase(s.charAt(i))) {
                newString += s.charAt(i);
            }
        }
        return newString;
    }

    //optimised solution tc is O(N) and O(N);
    public static String toLower1(String s) {
        StringBuilder stb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (Character.isUpperCase(s.charAt(i))) {
                stb.append(Character.toLowerCase(k));
            } else if (Character.isLowerCase(k)) {
                stb.append(k);
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        String input = "ABCddE";
        String output = toLower(input);
        System.out.println(output);
    }

}
