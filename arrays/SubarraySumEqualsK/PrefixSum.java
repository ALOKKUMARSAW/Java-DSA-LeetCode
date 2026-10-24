package arrays.SubarraySumEqualsK;


public class PrefixSum {

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = prefix[j + 1] - prefix[i];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }
}
