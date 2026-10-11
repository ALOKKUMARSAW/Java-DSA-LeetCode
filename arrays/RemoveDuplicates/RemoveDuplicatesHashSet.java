
import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicatesHashSet {

    public static int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println(
            "Unique elements: " + Arrays.toString(Arrays.copyOf(nums, k))
        );
    }
}
