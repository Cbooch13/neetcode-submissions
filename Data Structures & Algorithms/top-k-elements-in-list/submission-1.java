class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!counts.containsKey(nums[i])) {
                counts.put(nums[i], 1);
            } else {
                counts.put(nums[i], counts.get(nums[i]) + 1);
            }
        }

        ArrayList<Integer>[] bucket = new ArrayList[nums.length];
        for (Integer value : counts.keySet()) {
            if (bucket[counts.get(value) - 1] == null) {
                bucket[counts.get(value) - 1] = new ArrayList<>();
            }
            bucket[counts.get(value) - 1].add(value);
        }

        int[] topK = new int[k];
        int total = 0;
        for (int i = bucket.length - 1; i >= 0 && total < k; i--) {
            while(bucket[i] != null && bucket[i].size() > 0 && total < k) {
                topK[total] = bucket[i].remove(0);
                total++;
            }
        }

        return topK;
       
    }
}
