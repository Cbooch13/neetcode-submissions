class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        for (int i = 0; i < sortedNums.length; i++) {
            if (i > 0 && sortedNums[i] == sortedNums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = sortedNums.length - 1;
            while (left < right) {
                if (sortedNums[left]+sortedNums[i]+sortedNums[right] == 0) {
                    List<Integer> zeroSum = new ArrayList<>();
                    zeroSum.add(sortedNums[left]);
                    zeroSum.add(sortedNums[i]);
                    zeroSum.add(sortedNums[right]);
                    sums.add(zeroSum);
                    left++;
                    while (left < right && sortedNums[left] == sortedNums[left-1]) {
                        left++;
                    } 
                } else if (sortedNums[left]+sortedNums[i]+sortedNums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return sums;
    }
}
