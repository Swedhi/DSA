class Solution {
    public String countAndSay(int n) {

        // The first term of the sequence is "1"
        String result = "1";

        // We already have the 1st term,
        // so we need to generate n - 1 more terms
        for (int i = 2; i <= n; i++) {

            StringBuilder next = new StringBuilder();

            int j = 0;

            // Traverse the current string
            while (j < result.length()) {

                // Store the current digit
                char currentDigit = result.charAt(j);

                // Count how many times this digit occurs consecutively
                int count = 0;

                while (j < result.length()
                        && result.charAt(j) == currentDigit) {

                    count++;
                    j++;
                }

                // Append count first, then the digit
                next.append(count);
                next.append(currentDigit);
            }

            // The newly generated string becomes the current result
            result = next.toString();
        }

        return result;
    }
}