public class Find_Peak_Element {
    public static void main(String[] args) {


    }
    public int findPeakElement(int[] num) {
        if(num.length == 1) return 0;
        if(num[0]>num[1]) return 0;
        if(num[num.length-1]>num[num.length-2]) return num.length-1;

        return subFindMethod(num,1,num.length-2);
    }
    public int subFindMethod(int[] arr,int start,int end) {
        if(start == end) return start;

        int mid = (start + end)/2;
        if(mid == 0 || mid == arr.length-1) return mid;
        if(arr[mid-1]>arr[mid]) return subFindMethod(arr,start,mid-1);
        else if(arr[mid+1]>arr[mid]) return subFindMethod(arr,mid+1,end);
        else return mid;

    }
}

