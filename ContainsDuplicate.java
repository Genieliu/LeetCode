public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        HashSet<Integer> co = new HashSet<>();
        for(int i: nums)
            co.add(i);
        if(len == co.size()) return false;
        return true;
    }
}