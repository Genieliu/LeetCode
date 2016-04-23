public class Solution {
    public void moveZeroes(int[] nums) {
        submoveZeros(nums,0,nums.length-1);
    }
    
    private static void submoveZeros(int[] arr,int p,int r) {
        if(p<r){
            int q = (p+r)/2;
            submoveZeros(arr,p,q);
            submoveZeros(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int i = p;
        for(; i<=q && arr[i] != 0; i++);
        for(int j = q+1; j<r+1 && arr[j]!=0; j++) {
            arr[i] = arr[j];
            i++;
        }
        while(i<=r) {
            arr[i] = 0;
            i++;
        }

    }
}