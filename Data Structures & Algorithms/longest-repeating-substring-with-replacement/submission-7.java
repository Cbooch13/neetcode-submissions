class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int right = 0;
        int longest = 0;
        int maxCount = 0;

        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            right++;

            if (right - left - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(longest, right - left);

        }

        return longest;
        
    }
}
