class Solution {
    public int findMin(int[] nums) {

        int min = nums[0];
        int lower = 0;
        int higher = nums.length - 1;
        while (lower <= higher) {
            if (nums[lower] <= nums[higher]) {
                min = Math.min(min, nums[lower]);
                break;
            }
            int mid = lower + (higher - lower) / 2;

            if (nums[lower] <= nums[mid]) {
                lower = mid + 1;
            } else {
                min = nums[mid];
                higher = mid - 1;
            }
        }

        return min;
        
    }
}
