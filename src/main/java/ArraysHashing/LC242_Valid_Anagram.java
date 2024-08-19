package ArraysHashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-18
 */
public class LC242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        // edge case
        if (s.length() != t.length()) return false;

        // initialize a HashMap to count the frequency of each letter
        Map<Character, Integer> freqs = new HashMap<>();

        // count the letter freqs in string s
        for (char c : s.toCharArray()) {
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
        }

        // check anagram
        for (char c : t.toCharArray()) {
            if (!freqs.containsKey(c)) {
                return false;
            }
            freqs.put(c, freqs.get(c) - 1);
            if (freqs.get(c) <= 0) {
                freqs.remove(c);
            }
        }

        return freqs.isEmpty();
    }
}
