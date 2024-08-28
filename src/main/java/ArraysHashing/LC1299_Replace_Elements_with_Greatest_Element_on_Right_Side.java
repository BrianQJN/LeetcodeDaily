package ArraysHashing;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-27
 */
public class LC1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        // initialization
        int curMax = -1;
        int tmp;

        // iterate through the array from the end to start
        for (int i = arr.length - 1; i >= 0; i--) {
            tmp = arr[i];
            arr[i] = curMax;
            curMax = Math.max(curMax, tmp);
        }

        return arr;
    }
}
