class Solution {
    public int maxArea(int[] heights) {
        int left = 0; 
        int right = heights.length - 1;
        int max = 0;
        while (left < right) {
            int curr = Math.min(heights[left], heights[right]) * (right - left);
            if (curr > max) {
                max = curr;
            }

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
        
    }
}
