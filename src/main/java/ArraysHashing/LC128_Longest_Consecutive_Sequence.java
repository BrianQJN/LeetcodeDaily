package ArraysHashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-27
 */
public class LC128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        // initialization
        Set<Integer> numSet = new HashSet<>();
        int maxLen = 0;
        int curLen, curNum;

        // store the nums into HashSet
        for (int num : nums) {
            numSet.add(num);
        }

        // iterate through the nums
        for (int num : nums) {
            curLen = 1;
            curNum = num;

            // check if cur num is the start of a sequence
            if (numSet.contains(num - 1)) {
                continue;
            }

            // search the next element until it's not available
            while (numSet.contains(++curNum)) {
                curLen++;
            }

            // update the max length
            maxLen = Math.max(maxLen, curLen);
        }

        return maxLen;
    }
}
