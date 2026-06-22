class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {-1, -1};
        boolean found = false;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length && !found; i++) {
            Integer value = target - nums[i];
            if (map.containsKey(value)) {
                arr[0] = map.get(value);
                arr[1] = i;
                found = true;
            } else {
                map.put(nums[i], i);
            }
        }

        return arr;

    }
}
