class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {-1, -1};
        boolean found = false;
        for (int i = 0; i < nums.length && !found; i++) {
            for (int j = i + 1; j < nums.length && !found; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    found = true;
                }
            }
        }

        return arr;

    }
}
