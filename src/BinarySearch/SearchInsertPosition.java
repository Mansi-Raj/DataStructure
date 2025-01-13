package BinarySearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (mid == 0)
                    return 0;
                if (nums[mid - 1] < target) {
                    return mid;
                } else {
                    e = mid - 1;
                }
            } else if (nums[mid] < target) {
                if (nums.length - 1 == mid) {
                    return nums.length;
                }
                if (nums[mid + 1] > target) {
                    return mid + 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
