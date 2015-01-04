public class Solution {
    public int majorityElement(int[] num) {
        Arrays.sort(num);
        int count = 1;
        int mark = 1;
        int tmp = num[0];
        while(count < num.length) {
            if(tmp != num[count]) {
                mark = 1;
                tmp = num[count];
				count += 1;
				
            } else {
                mark += 1;
                count += 1;
                if(mark>num.length/2) return tmp;
            }
        }
		return tmp;
    }
}