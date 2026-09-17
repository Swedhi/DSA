class Solution {
    public String multiply(String num1, String num2) {

        // If either number is 0, the answer is 0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();

        // Maximum possible length of the answer
        // is n + m
        int[] result = new int[n + m];

        // Start from the last digit of num1
        for (int i = n - 1; i >= 0; i--) {

            // Start from the last digit of num2
            for (int j = m - 1; j >= 0; j--) {

                // Convert character to integer digit
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                // Multiply the two digits
                int product = digit1 * digit2;

                // Add the product to the correct position
                int position2 = i + j + 1;
                int position1 = i + j;

                result[position2] = result[position2] + product;

                // Handle carry
                result[position1] = result[position1]
                                   + result[position2] / 10;

                result[position2] = result[position2] % 10;
            }
        }

        // Convert the result array into a String
        StringBuilder answer = new StringBuilder();

        int index = 0;

        // Skip leading zeros
        while (index < result.length && result[index] == 0) {
            index++;
        }

        // Add remaining digits
        while (index < result.length) {
            answer.append(result[index]);
            index++;
        }

        return answer.toString();
    }
}