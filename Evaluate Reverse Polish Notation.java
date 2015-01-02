import java.lang.*;


public class Solution {
		public static void main(String[] args){
			String[] s = {"4","13","5","/","+"};
			int result = evalRPN(s);
			System.out.println(result);
		}
	    public static int evalRPN (String[] s) {
			int[] a = new int[s.length];
			int k = 0;
			String c = null;
			for(int i= 0; i < s.length; i++){
				c = s[i];
				switch(c){
					case "+":
						a[k-2] = a[k-1] + a[k-2];
						k = k-1;
						break;
					case "-":
						a[k-2] = a[k-2] - a[k-1];
						k = k-1;
						break;
					case "*":
						a[k-2] = a[k-1] * a[k-2];
						k = k-1;
						break;
					case "/":
						a[k-2] = a[k-2] / a[k-1];
						k = k-1;
						break;
					default:
						a[k] = toNum(c);
						k += 1;
						break;
				}
			}
			return a[0];

   	 	}
		public static int toNum(String s){
			int result = 0;
			char c = ' ';
			s.trim();
			int count = s.length() - 1;
			int sign = 1;
			//s = s.trim();
			for(int i = 0; i < s.length(); i++){
				c = s.charAt(i);
				switch(c){
					case '-':
						count -= 1;
						sign = -1;
						break;
					case '0':
						count -= 1;
						break;
					case '1':
						result += 1 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '2':
						result += 2 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '3':
						result += 3 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '4':
						result += 4 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '5':
						result += 5 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '6':
						result += 6 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '7':
						result += 7 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '8':
						result += 8 * (int)Math.pow(10,count);
						count -= 1;
						break;
					case '9':
						result += 9 * (int)Math.pow(10,count);
						count -= 1;
						break;
					default:
						System.out.println("Error input");
						break;
				}
		}
		return result*sign;
	}

}
