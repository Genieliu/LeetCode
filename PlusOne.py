class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        l = len(digits)
        mark = -1
        for i in range(l-1,-1,-1):
            if digits[i] != 9:
                mark = i
                break
            else:
                digits[i] = 0

        if mark == -1:
            digits = [1] + digits
        else:
            digits[mark] += 1
        
        return digits
        
                