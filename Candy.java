public class Solution {
    public int candy(int[] ratings) {
        Pair tmp = new Pair(1,1);
        for(int i = ratings.length-2; i>=0; i--) {
            if(ratings[i] < ratings[i+1]) {
                if(tmp.last > 1)
                    tmp = new Pair(tmp.first+1,1);
                else
                    tmp = new Pair(tmp.first+ratings.length-i,1);
            } else if(ratings[i] == ratings[i+1])
                tmp = new Pair(tmp.first+tmp.last,tmp.last);
            else
                tmp = new Pair(tmp.first+tmp.last+1,tmp.last+1);
        }
        return tmp.first;
    }


    class Pair {
        public int first;
        public int last;
        public Pair() {
            first = 0;
            last = 0;
        }
        public Pair(int f,int l) {
            first = f;
            last = l;
        }
    }
}