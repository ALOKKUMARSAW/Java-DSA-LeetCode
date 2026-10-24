
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Step 1: Store all numbers in the HashSet
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;

        // Step 2: Start counting only at sequence beginnings
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                // Step 3: Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence: " + result);
    }
}
