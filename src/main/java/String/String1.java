package String;

public class String1 {
    /*Given a non-empty sequence of characters s, return true if sequence is Binary, else return false.
     *Examples:
     *Input: s = "101"
     *Output: true
     *Explanation: Since string contains only '0' and '1', output is true.
     *
     */
    //brute force code tc and sc will be O(n) and O(1)
    public static boolean isBinaryBruteForce(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1') {
                count++;
            }
        }
        return count == s.length();
    }

    // this is on code tc and sc will be O(n) and O(n) beacuase we are using toCharArray() .
    public static boolean isBinary(String s) {
        // Your code here
        boolean flag = true;
        for (char ch : s.toCharArray()) {
            int k = ch - '0';
            if (k != 1 && k != 0) {
                flag = false;
            }

        }
        return flag;
    }

    //optimised code
    public static boolean isBinaryOptimized(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String nam = "101";
        boolean kl = isBinaryBruteForce(nam);
        if (kl) {
            System.out.println(" this is Binary");
        } else {
            System.out.println("this is not Binary");
        }

    }
}
