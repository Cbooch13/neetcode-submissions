class Solution {
    public int climbStairs(int n) {
        int one = 0;
        int two = 1;
        int sum = 1;
        for (int i = 0; i < n; i++){
            sum = one + two;
            one = two;
            two = sum;

        }
        return sum;
    }
}
