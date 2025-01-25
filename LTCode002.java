package Leetcode;

class Solution2 {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return reversed;
    }
}

public class LTCode002 {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int x = 436;
        int result = s.reverse(x);
        System.out.println("Number: " + x + "\nReversed: " + result);
    }

}
