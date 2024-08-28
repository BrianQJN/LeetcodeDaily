package ArraysHashing;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-27
 */
public class LC1929_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        // initialization
        int n = nums.length;
        int[] res = new int[n * 2];

        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }

        return res;
    }
}
