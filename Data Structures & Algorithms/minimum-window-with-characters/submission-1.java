class Solution {
    public String minWindow(String s, String t) {
        String retStr = "";
        Map<Character, Integer> count = new HashMap<>();
        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int need = count.size();
        int have = 0;
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            if (count.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c) == count.get(c)) {
                    have++;
                }
                while (l < r && have == need) {
                    char lChar = s.charAt(l);
                    if (retStr.equals("") || r - l < retStr.length()) {
                        retStr = s.substring(l, r);
                    }
                    if (window.containsKey(lChar)) {
                        window.put(lChar, window.get(lChar) - 1);
                        if (window.get(lChar) < count.get(lChar)) {
                            have--;
                        }
                    }
                    l++;
                }
            }        
        }



        return retStr;
    }
}
