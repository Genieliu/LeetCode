import java.lang.*;


public class Solution {
		public static void main(String[] args){
				String s = "Hello World! ";
				System.out.println(reverseWords(s));
		}
	    public static String reverseWords(String s) {
			String tmp = "";
			int i = 0;
			int mark = 0;
			String w = "";
			for(i = 0; i < s.length(); i++){
				if(s.charAt(i) != ' '){
						mark = 1;
						w += s.charAt(i);
				}
				else if(mark == 1){
						mark = 0;
						tmp = " " + w + tmp;
						w = "";
				}
			}
			if(mark == 1) tmp = w + tmp;
			else tmp = tmp.trim();

			return tmp;
   	 	}
}
