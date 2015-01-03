public class Solution {
    public int trailingZeroes(int n) {
        if(n<5) return 0;

        int count=0;
        int test=1;
        while(n>test) {
			count += n/5;
			n /= 5;
        }
		return count;

    }
}