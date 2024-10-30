public class Solution2 {
    public String customSortString(String order, String s) {
        StringBuilder resBuilder = new StringBuilder();

        // Frequency array to count occurrences of each character in 's'
        int[] frequency = new int[26];
        for (char ch : s.toCharArray()) {
            frequency[ch - 'a']++;
        }

        // Append characters based on the order specified
        for (char ch : order.toCharArray()) {
            if (frequency[ch - 'a'] > 0) {
                // Append the character based on its frequency
                for (int i = 0; i < frequency[ch - 'a']; i++) {
                    resBuilder.append(ch);
                }
                frequency[ch - 'a'] = 0; // Reset frequency after adding
            }
        }

        // Append remaining characters not in the order
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                char ch = (char) (i + 'a');
                for (int j = 0; j < frequency[i]; j++) {
                    resBuilder.append(ch);
                }
            }
        }

        return resBuilder.toString();
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String order = "cba";
        String s = "abcd"; // Example input
        String result = solution2.customSortString(order, s);
        System.out.println(result); // Expected output: "cbad"
    }
}
