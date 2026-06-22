class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int longest = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (chars.add(s.charAt(right))) {
                right++;
                longest = Math.max(right - left, longest);
            } else {
                chars.remove(s.charAt(left));
                left++;
            }
        }

        return longest;
        
    }
}
