class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        length = len(nums)
        counts = [0] * (length - 1)
        for i in range(length):
            j = nums[i] - 1
            counts[j] += 1;
            if (counts[j] > 1):
                return j + 1