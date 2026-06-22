class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        for (int i = 0; i < products.length; i++) {
            products[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (i != j) {
                    products[j] = products[j] * nums[i];
                }
            }
        }

        return products;
    }
}  
