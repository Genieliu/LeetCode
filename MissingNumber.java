public class Solution {
    public int missingNumber(int[] nums) {
        long sum = (nums.length+1)*nums.length/2;
        for(int i = 0;i<nums.length;i++)
            sum -= nums[i];
        return (int)sum;
    }
}