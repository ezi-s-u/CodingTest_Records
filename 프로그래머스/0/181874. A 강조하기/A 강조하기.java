class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            // if(myString.charAt(i) == 'a' || myString.charAt(i) =='A')
            answer += myString.charAt(i) == 'a' || myString.charAt(i) == 'A' ? "A" : Character.toString(myString.charAt(i)).toLowerCase();
        }
        return answer;
    }
}