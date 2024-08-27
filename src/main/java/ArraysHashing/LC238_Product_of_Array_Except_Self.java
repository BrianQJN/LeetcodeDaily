package ArraysHashing;

import java.util.Arrays;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-23
 */
public class LC238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        // initialization
        int left_product = 1;
        int right_product = 1;

        int[] res = new int[nums.length];

        // calculate the left production and update
        for (int i = 0; i < nums.length; i++) {
            res[i] = left_product;
            left_product *= nums[i];
        }

        // calculate the right production and update
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right_product;
            right_product *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        LC238_Product_of_Array_Except_Self test = new LC238_Product_of_Array_Except_Self();
        System.out.println(Arrays.toString(test.productExceptSelf(nums)));
    }
}
