class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
