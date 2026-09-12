class Solution {
    public String convert(String s, int numRows) {

        // If there is only one row,
        // zigzag conversion does not change anything.
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create a StringBuilder for each row.
        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;

        // 1 means moving down
        // -1 means moving up
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {

            // Put current character into current row
            rows[currentRow].append(s.charAt(i));

            // If we reach the top, start moving down
            if (currentRow == 0) {
                direction = 1;
            }

            // If we reach the bottom, start moving up
            else if (currentRow == numRows - 1) {
                direction = -1;
            }

            // Move to the next row
            currentRow += direction;
        }

        // Combine all rows
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            answer.append(rows[i]);
        }

        return answer.toString();
    }
}