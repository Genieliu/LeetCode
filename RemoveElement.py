class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        n = 0
        ne = []
        for i in nums:
            if i != val:
                n += 1
                ne.append(i)
        nums[:] = ne
        return n
        
        
