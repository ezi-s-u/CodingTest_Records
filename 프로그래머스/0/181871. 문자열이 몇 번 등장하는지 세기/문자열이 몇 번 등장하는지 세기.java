class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int myStrLength = myString.length();
        int patLength = pat.length();
        StringBuilder str = new StringBuilder(myString);
        for(int i = 0; i <= myStrLength-patLength; i++) {
            if(str.substring(i, i+patLength).equals(pat)) answer++;
        }
        return answer;
    }
}