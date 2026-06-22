class Solution {
    public int search(int[] nums, int target) {
        int lower = 0;
        int higher = nums.length - 1;

        while (lower <= higher) {
            int guess = lower + ((higher - lower) / 2);
            if (nums[guess] < target) {
                lower = guess + 1;
            } else if (nums[guess] > target) {
                higher = guess - 1;
            } else {
                return guess;
            }
        }

        return -1;
        
    }
}
