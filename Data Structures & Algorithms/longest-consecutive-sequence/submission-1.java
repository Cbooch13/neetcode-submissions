class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                int next = num + 1;
                while (set.contains(next)) {
                    next++;
                    length++;
                }
                maxLength = Math.max(length, maxLength);
            }


        }
        return maxLength;

        
    }
}
