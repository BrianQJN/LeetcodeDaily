package ArraysHashing;

import java.util.*;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-18
 */
public class LC49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // initialize a HashMap to store each possible chars combinations and their corresponding strings
        Map<Map<Character, Integer>, List<String>> groupAnagrams = new HashMap<>();

        // traverse the array
        for (String str : strs) {
            // initialize a HashMap to count char freqs
            Map<Character, Integer> charFreqs = new HashMap<>();
            // count chars freqs
            for (char c : str.toCharArray()) {
                charFreqs.put(c, charFreqs.getOrDefault(c, 0) + 1);
            }
            // if this is new combination, initialize its group list
            if (!groupAnagrams.containsKey(charFreqs)) {
                groupAnagrams.put(charFreqs, new ArrayList<>());
            }
            // add cur str to the anagram group list
            groupAnagrams.get(charFreqs).add(str);
        }

        return new ArrayList<>(groupAnagrams.values());
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        // initialize a HashMap to store sorted string as key and anagrams as value
        Map<String, List<String>> anagramGroup = new HashMap<>();

        // traverse the array
        for (String str : strs) {
            // convert the string to char array and sort it
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // if cur sorted string not in the map, add it
            if (!anagramGroup.containsKey(sortedStr)) {
                anagramGroup.put(sortedStr, new ArrayList<>());
            }

            anagramGroup.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramGroup.values());
    }
}
