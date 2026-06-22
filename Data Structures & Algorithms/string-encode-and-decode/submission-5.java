class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return null;
        }
        StringBuilder s = new StringBuilder();
        String delimiter = new String(new byte[]{(byte) 0xFF, (byte) 0xFE});
        for (int i = 0; i < strs.size(); i++) {
            s.append(strs.get(i));
            if (i < strs.size() - 1) {
                s.append(delimiter);
            }
        }
        return s.toString();

    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>();
        
        if (str == null) {
            return strList;
        }
        String delimiter = new String(new byte[]{(byte) 0xFF, (byte) 0xFE});
        String[] strs = str.split(delimiter);

        for (int i = 0; i < strs.length; i++) {
            strList.add(strs[i]);
        }
        return strList;
    }
}
