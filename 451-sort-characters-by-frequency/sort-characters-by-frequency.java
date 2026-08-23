import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {

        // Step 1: Count the frequency of every character.
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char currentCharacter = s.charAt(i);

            if (frequencyMap.containsKey(currentCharacter)) {
                frequencyMap.put(
                    currentCharacter,
                    frequencyMap.get(currentCharacter) + 1
                );
            } else {
                frequencyMap.put(currentCharacter, 1);
            }
        }

        // Step 2:
        // Create a Max Heap.
        //
        // The character with the higher frequency
        // should come before the character with lower frequency.
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (character1, character2) ->
                frequencyMap.get(character2) - frequencyMap.get(character1)
        );

        // Step 3:
        // Add every unique character to the heap.
        for (char currentCharacter : frequencyMap.keySet()) {
            maxHeap.offer(currentCharacter);
        }

        // Step 4:
        // Build the answer.
        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            // Get the character with the highest frequency.
            char currentCharacter = maxHeap.poll();

            int currentFrequency = frequencyMap.get(currentCharacter);

            // Add this character according to its frequency.
            for (int i = 0; i < currentFrequency; i++) {
                result.append(currentCharacter);
            }
        }

        return result.toString();
    }
}