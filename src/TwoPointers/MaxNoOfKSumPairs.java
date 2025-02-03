package TwoPointers;

import java.util.Arrays;

public class MaxNoOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length - 1;
        int count = 0;
        while (s < e) {
            int sum = nums[s] + nums[e];
            if (sum == k) {
                count++;
                s++;
                e--;
            } else if (sum > k) {
                e--;
            } else if (sum < k) {
                s++;
            }
        }
        return count;
    }
}