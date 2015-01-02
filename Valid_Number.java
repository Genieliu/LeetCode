import java.util.*;

public class Valid_Number {
    public static boolean isNumber(String s) {
        boolean Eflag,DotFlag,NextEflag,DotAfterNull;
        Eflag = DotFlag = DotAfterNull = false;
        NextEflag = true;
        Set<String> alle = new HashSet<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9",".","e","E","-","+"));
        Set<String> num0 = new HashSet<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));
        Set<String> num = new HashSet<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        String first;
        boolean sSpace,eSpace,numStart;
        sSpace = eSpace = numStart = false;
        if(s.length() > 0)
            first = s.substring(0,1);
        boolean numMark = false;
        boolean endMark = true;

        for(int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i,i+1);
            if(tmp.equals(" ") ) {
                if(numStart == false) sSpace = true;
                else eSpace = true;
            } else {
                if(eSpace == true) return false;
                numStart = true;
                if(num0.contains(tmp)) {
                    numMark = true;
                    if(NextEflag == false) NextEflag = true;
                }
                if(!alle.contains(tmp)) return false;
                if(tmp.equals(".")) {
                    if(DotFlag == true || Eflag == true) return false;
                    else
                        DotFlag = true;
                }
                if(tmp.equals("e") || tmp.equals("E")) {
                    if(Eflag == true) return false;
                    Eflag = true;
                    NextEflag = false;
                    boolean Mark = false;
                    for(int j = 0; j<i; j++) {
                        String before = s.substring(j,j+1);
                        if(num0.contains(before)) {
                            Mark = true;
                        }
                    }
                    if(Mark == false) return false;
                }
                if(tmp.equals("-") || tmp.equals("+")) {
                    String tmpBefore;
                    if(i != 0) {
                        tmpBefore = s.substring(i-1,i);
                        if(!tmpBefore.equals("e"))
                            for(int j = 0; j<i; j++) {
                                String before = s.substring(j,j+1);
                                if(!before.equals(" ")) {
                                    return false;
                                }
                            }
                    }
                }
            }
        }
        if(NextEflag == false) return false;
        String end = s.substring(s.length()-1,s.length());
        if(end.equals("e")) endMark = false;
        if(numMark == false || endMark == false) return false;
        else return true;
    }
}