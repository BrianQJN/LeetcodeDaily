package ArraysHashing;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-29
 */
public class LC912_Sort_an_Array {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // sort first and second halves
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            // merge the sorted two halves
            merge(nums, left, mid, right);
        }
    }

    private void merge(int[] nums, int left, int mid, int right) {
        // calculate lens of the two halves
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp arrays for the two halves
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // copy data to temp arrays
        System.arraycopy(nums, left, leftArray, 0, n1);
        System.arraycopy(nums, mid + 1, rightArray, 0, n2);

        // merge the temp arrays back into nums
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k++] = leftArray[i++];
            } else {
                nums[k++] = rightArray[j++];
            }
        }

        // copy remaining elements of leftArray and rightArray, if any
        while (i < n1) {
            nums[k++] = leftArray[i++];
        }

        while (j < n2) {
            nums[k++] = rightArray[j++];
        }
    }
}
