public class Solution {
	
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] Mark = new boolean[s.length()+1];
        for(int i = 0; i<s.length(); i++)
            Mark[i] = false;
        Mark[s.length()] = true;
        for(int i = s.length()-1; i >= 0; i--) {
            for(int j = i+1; j<s.length()+1; j++) {
                String tmp = s.substring(i,j);
                if(dict.contains(tmp)) {
                    if(Mark[j] == true) Mark[i] = true;
                }
            }
        }
        return Mark[0];
    }


}