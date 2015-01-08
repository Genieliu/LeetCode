public class Solution {
    public String convertToTitle(int n) {
        String tmp = "";
        int a = 0;
        char add;
        while(n>0) {

            if(n<27) {
                a = n;
                add = 'A' + n -1;
                tmp = add + tmp;
                return tmp;
            }
            a = n%26;
            if(a == 0) {
                add = 'Z';
                n = n/26-1;
            } else {
                add = 'A'+a-1;
                n = (n-a)/26;
            }
            tmp = tmp + add;

        }
        return tmp;
    }
}