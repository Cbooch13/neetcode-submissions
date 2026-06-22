class Solution {
    public String minWindow(String s, String t) {
        
        String retStr = "";
        Map<Character, Integer> count = new HashMap<>();
        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            if (count.getOrDefault(c, 0) != 0) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                boolean matches = true;
                for (char key : count.keySet()) {
                    if (window.getOrDefault(key, 0) < count.get(key)) {
                        matches = false;
                        break;
                    }
                }
                if (matches) {
                    if (retStr.equals("") || r - l < retStr.length()) {
                        retStr = s.substring(l, r);
                    }

                    while (l < r && matches) {
                        char lChar = s.charAt(l);
                        if (count.getOrDefault(lChar, 0) != 0) {
                            if (retStr.equals("") || r - l < retStr.length()) {
                                retStr = s.substring(l, r);
                            }
                            window.put(lChar, window.get(lChar) - 1);
                            if (window.get(lChar) < count.get(lChar)) {
                                matches = false;
                            }
                        }
                        l++;
                    }
                } 
            }
        }

        return retStr;
    }
}
