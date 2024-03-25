import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        List arr = new ArrayList<Long>(3);
        long num = 10;
        String ex = "";
        while(n != 0) {
            arr.add(n % num);
            n /= 10;
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        for(int i = 0; i < arr.size(); i++) {
            ex += arr.get(i);
        }
        return Long.parseLong(ex);
    }
}