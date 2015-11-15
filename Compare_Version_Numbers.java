public class Compare_Version_Numbers {
    public static void main(String[] args) {
        compareVersion("0.2","1.2");
        // String s = "0.2";
        // for(String e : s.split("\\."))
        // System.out.println(e);
    }
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int a,b;
        int max = v1.length>v2.length?v2.length:v1.length;
        for(int i=0; i<max; i++) {
            a = Integer.parseInt(v1[i]);
            b = Integer.parseInt(v2[i]);
            if(a != b) return a>b?1:-1;
        }
        if(v1.length == v2.length) return 0;
        if(v1.length > v2.length) {
            for(int i = max; max < v1.length; i++) {
                a = Integer.parseInt(v1[i]);
                if(a>0) return 1;
            }
            return 0;
        } else {
            for(int i = max; max < v2.length; i++) {
                b = Integer.parseInt(v2[i]);
                if(b>0) return -1;
            }
            return 0;
        }
    }
}