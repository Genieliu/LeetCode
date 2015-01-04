public class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        char c;
        String tmp = s;
        int slength = 0;
        while(!tmp.isEmpty()) {
            slength = tmp.length();
            c = tmp.charAt(0);
            tmp = tmp.subString(1,slength);
            sum = sum*26+(c-'A'+1);
        }
		return s;
    }
}