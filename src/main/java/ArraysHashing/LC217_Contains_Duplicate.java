package ArraysHashing;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-16
 */
public class LC217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        // create a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // iterate through the array
        for (int num : nums) {
            // add cur num to set, if it is seen, return true
            if(!uniqueElements.add(num)) {
                return true;
            }
        }

        // no duplicates found, return false
        return false;
    }
}
