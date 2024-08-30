package ArraysHashing;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-29
 */
public class LC14_Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        // Choose the first str in the array as initial prefix
        String prefix = strs[0];

        // traverse the array
        for (int i = 1; i < strs.length; i++) {
            // check if cur prefix is the prefix of the cur string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }
}
