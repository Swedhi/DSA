class Solution {

    public int myAtoi(String s) {

        int index = 0;
        int n = s.length();

        // Step 1: Remove leading spaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Determine the sign
        int sign = 1;

        if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (index < n && s.charAt(index) == '+') {
            sign = 1;
            index++;
        }

        // Step 3: Build the number
        long result = 0;

        while (index < n) {

            char ch = s.charAt(index);

            // Stop when the character is not a digit
            if (ch < '0' || ch > '9') {
                break;
            }

            // Convert character into integer
            int digit = ch - '0';

            // Add digit to result
            result = result * 10 + digit;

            // Step 4: Check overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        // Apply the sign
        return (int) (result * sign);
    }
}