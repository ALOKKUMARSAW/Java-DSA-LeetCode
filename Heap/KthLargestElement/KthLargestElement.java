import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxHeap.offer(nums[i]);
        }

        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }

        return maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(nums, k);

        System.out.println("K: " + k);
        System.out.println("Kth Largest Element: " + result);
    }
}
