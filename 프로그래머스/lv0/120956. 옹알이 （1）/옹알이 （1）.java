class Solution {
    public int solution(String[] babbling) {
        int answer = babbling.length;
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya","*");
            babbling[i] = babbling[i].replace("ye","*");
            babbling[i] = babbling[i].replace("woo","*");
            babbling[i] = babbling[i].replace("ma","*");
        }
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < babbling[i].length(); j++) {
                if(babbling[i].charAt(j) != '*') {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}