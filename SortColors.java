public class Solution {
    public void sortColors(int[] A) {
        int[] B = new int[A.length];
        int count = 0;
        for(int i = 0; i<A.length; i++) {
            if(A[i] == 0) {
                B[count] = 0;
                count++;
            }
        }
        for(int i = 0; i<A.length; i++) {
            if(A[i] == 1) {
                B[count] = 1;
                count++;
            }
        }
        for(int i = 0; i<A.length; i++) {
            if(A[i] == 2) {
                B[count] = 2;
                count++;
            }
        }
		for(int i = 0;i<A.length;i++)
			A[i] = B[i];
		
    }
}