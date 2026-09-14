class Solution {
    public String intToRoman(int num) {

        // Roman numeral values in descending order
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        // Corresponding Roman symbols
        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        // StringBuilder is used because we will keep adding characters
        StringBuilder result = new StringBuilder();

        // Check every Roman value from largest to smallest
        for (int i = 0; i < values.length; i++) {

            // Keep using the current Roman value
            // while it can be subtracted from num
            while (num >= values[i]) {

                // Add the corresponding Roman symbol
                result.append(symbols[i]);

                // Reduce the number
                num = num - values[i];
            }
        }

        // Convert StringBuilder to String
        return result.toString();
    }
}