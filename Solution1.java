public class Solution1 {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i += 2 * k) {
            // Reverse the first k characters in the current segment
            reverseK(i, Math.min(i + k - 1, n - 1), str);
        }
        return new String(str);
    }

    private void reverseK(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1(); // Create an instance of Solution1
        String input = "abcdefg"; // Example input
        int k = 2; // Example k value
        String result = solution.reverseStr(input, k); // Call reverseStr on the instance
        System.out.println(result); // Expected output: "bacdfeg"
    }
}
