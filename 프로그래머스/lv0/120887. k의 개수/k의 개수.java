class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <= j; a++) {
            int t = a;
            while(t != 0) {
                if(t % 10 == k) answer++;
                t /= 10;
            }
        }
        return answer;
    }
}