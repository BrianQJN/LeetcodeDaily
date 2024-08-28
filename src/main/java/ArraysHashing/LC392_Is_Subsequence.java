package ArraysHashing;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-27
 */
public class LC392_Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        // initialize two pointers
        int i = 0, j = 0;

        // iterate through the String t
        while (j < t.length()) {
            // check if char matches in the two Strings
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}
