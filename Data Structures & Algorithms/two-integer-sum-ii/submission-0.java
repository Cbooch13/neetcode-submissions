class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int num = numbers[left] + numbers[right];
            if (num < target) {
                left++;
            } else if (num > target) {
                right--;
            } else {
                return new int[] {left + 1, right + 1};
            }
        }
        return null;
        
    }
}
