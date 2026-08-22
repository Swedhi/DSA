class Solution {
    public boolean isAnagram(String s, String t) {

        // Anagrams must contain the same number of characters.
        // If their lengths are different, they cannot be anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // There are 26 lowercase English letters.
        //
        // frequency[0] represents 'a'
        // frequency[1] represents 'b'
        // frequency[2] represents 'c'
        // ...
        // frequency[25] represents 'z'
        int[] frequency = new int[26];

        // Count the characters of s.
        for (int i = 0; i < s.length(); i++) {

            // Convert the character into an index.
            //
            // Example:
            // s.charAt(i) = 'c'
            // 'c' - 'a' = 2
            int index = s.charAt(i) - 'a';

            // Increase the frequency of this character.
            frequency[index]++;
        }

        // Subtract the characters of t.
        for (int i = 0; i < t.length(); i++) {

            // Convert the character into an index.
            int index = t.charAt(i) - 'a';

            // Decrease the frequency.
            frequency[index]--;
        }

        // If s and t are anagrams,
        // every frequency should become 0.
        for (int i = 0; i < 26; i++) {

            // A non-zero value means that
            // the character counts are different.
            if (frequency[i] != 0) {
                return false;
            }
        }

        // Every character occurred the same number of times.
        return true;
    }
}