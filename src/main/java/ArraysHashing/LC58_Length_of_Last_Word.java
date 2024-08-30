package ArraysHashing;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-29
 */
public class LC58_Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        // trim the string to remove any leading or trailing spaces
        s = s.trim();

        // initialize a counter to count the length
        int len = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            // if meet a space, means we have traversed the last word, break
            if (s.charAt(i) == ' ') {
                break;
            }

            // increment the length count
            len++;
        }

        return len;
    }
}
