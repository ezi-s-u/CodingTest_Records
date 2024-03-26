class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long n = (long)num;
        while(n != 1) {
            if(cnt >= 500) break;
            
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            cnt++;
        }
        
        if(n == 1) {
            answer = cnt;
        } else {
            answer = -1;
        }
        return answer;
    }
}