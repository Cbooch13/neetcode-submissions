class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] counts = new int[26];
            StringBuilder str = new StringBuilder("");
            for (int j = 0; j < strs[i].length(); j++) {
                counts[strs[i].charAt(j) - 'a']++;
            }
            for (int num : counts) {
                str.append("#" + num);
            }


            if (!anagrams.containsKey(str.toString())) {
                anagrams.put(str.toString(), new ArrayList<String>());
            }
            anagrams.get(str.toString()).add(strs[i]);

        }

        List<List<String>> anagramList = new ArrayList<List<String>>();
        for (String key : anagrams.keySet()) {
            anagramList.add(anagrams.get(key));
        }
 
        return anagramList;
        
    }
}
