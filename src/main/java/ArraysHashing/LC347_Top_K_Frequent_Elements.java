package ArraysHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Brian Qu
 * @version 1.0
 * @implSpec
 * @since 2024-08-18
 */
public class LC347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        // initialize a HashMap to count the num freqs, and a min Heap
        Map<Integer, Integer> numFreq = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> numFreq.get(a) - numFreq.get(b));

        // count the num freqs
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }

        // add num to the minHeap
        for (int num : numFreq.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // extract the elements from the heap
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll();
        }

        return res;
    }
}
