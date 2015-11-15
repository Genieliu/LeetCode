import sys
class Solution(object):
    def removeDuplicates(self, nums):
        end = 0
        for i in range(1, len(nums)):
            if nums[i] != nums[end]:
                nums[end+1],end = nums[i],end + 1
        if nums:
            return end +1
        else:
            0
