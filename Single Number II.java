public class Solution {
    public int singleNumber(int[] A) {
        int ones,twos,threes;
        ones = twos = threes=0;
        for(int i = 0; i < A.length; i++) {
			twos |= ones & A[i];
			ones = ones ^ A[i];
			threes = ones & twos;
			ones = ones & ~threes;
			twos = twos & ~threes;
        }
		return ones;
    }
}