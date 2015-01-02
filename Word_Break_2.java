public class Solution {


    public List<String> wordBreak(String s, Set<String> dict) {
        HashMap<String,List<String>> result = new HashMap<>();
        for(int i = s.length()-1; i >= 0; i--) {
            ArrayList<String> newArray = new ArrayList<>();
			String saveString = s.substring(i,s.length());
            for(int j = i+1; j<s.length()+1; j++) {
                String tmp = s.substring(i,j);
                if(dict.contains(tmp)) {
                    
                    if(j == s.length())
                        newArray.add(tmp);
                    else {
						String remain = s.substring(j,s.length());
                        if(result.containsKey(remain)) {
                            List<String> remainArray = result.get(remain);
							for(String item : remainArray) {
                                newArray.add(tmp + " " + item);
                            }

                        }
                    }
                }
            }
			result.put(saveString,newArray);
        }
        return result.get(s);
    }
}