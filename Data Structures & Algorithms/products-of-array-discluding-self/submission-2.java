class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = 1;
                postfix[nums.length - 1 - i] = 1;
            } else {
                prefix[i] = prefix[i - 1] * nums[i - 1];
                postfix[nums.length - 1 - i] = postfix[nums.length - i] * nums[nums.length - i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            products[i] = prefix[i] * postfix[i];
        }

        return products;
    }
}  
