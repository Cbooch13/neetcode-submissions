class Solution {
    public int search(int[] nums, int target) {
        int lower = 0;
        int higher = nums.length - 1;
        while (lower <= higher) {
            int mid = lower + (higher - lower) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if (nums[lower] <= nums[mid]) {
                if (target > nums[mid] || target < nums[lower]) {
                    lower = mid + 1;
                } else {
                    higher = mid - 1;
                }
            } else {
                if (target > nums[higher] || target < nums[mid]) {
                    higher = mid - 1;
                } else {
                    lower = mid + 1;
                }
            }
 
        }

        return -1;
    }
}
