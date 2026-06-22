class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;

        int[] sol = new int[len];
        sol[0] = 0;

        boolean carry = false;
        for (int i = len - 1; i >= 0; i--) {
            int workingDigit = digits[i];
            if (i == len - 1) {
                workingDigit++;
            }
            if (carry) {
                workingDigit++;
                carry = false;
            }
            sol[i] = workingDigit % 10;
            if (workingDigit / 10 > 0) {
                carry = true;
            }
        }
        if (carry) {
            sol = new int[sol.length + 1];
            sol[0] = 1;
            for (int i = 1; i < sol.length; i++) {
                sol[i] = 0;
            }
        }
        return sol;
    }
}
