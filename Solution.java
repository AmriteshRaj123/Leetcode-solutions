public class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        long sum = 0;
        int i = 0;

        // Skip leading whitespace
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Check for sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            sum = sum * 10 + digit;

            // Check for overflow and underflow
            if (sum * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sum * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            i++;
        }

        return (int) sum * sign;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "   -42"; // Example input
        int result = solution.myAtoi(input);
        System.out.println(result); // Output: -42
    }
}
