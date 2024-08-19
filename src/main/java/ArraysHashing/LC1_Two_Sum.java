package ArraysHashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-18
 */
public class LC1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        // initialize a HashMap to store nums and their indices
        Map<Integer, Integer> numIndex = new HashMap<>(); // {num, index}
        int remain = 0;

        // traverse the array
        for (int i = 0; i < nums.length; i++) {
            remain = target - nums[i];

            // check if the remain exists in the map
            if (numIndex.containsKey(remain)) {
                return new int[] {i, numIndex.get(remain)};
            }

            // if remain not exists in the map, add cur num to map
            numIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException("No Solution");
    }
}
