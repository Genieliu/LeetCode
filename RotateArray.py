class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n
        if k == 0:
            pass
        else:
            x = nums[-k:]
            y = nums[0:n-k]
        
            nums[0:k] = x
            nums[-n+k:] = y