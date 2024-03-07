class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String[] skipArray = skip.split("");
        
        for(int i = 0; i < s.length(); i++) {
            String afterS = "";
            
            int before = s.charAt(i);
            
            int j = 1;
            // index만큼 뒤에 있는 알파벳 구하기
            while(afterS.length() <= index){
                // skip 알파벳 제거
                for(int k = 0; k < skipArray.length; k++) {
                    afterS = afterS.replace(skipArray[k], "");
                }
                
                
//                 if((before+j) >= 123) {
//                         // afterS += (char)((before+j)-((before+j-97)/26));
//                         afterS += (char)((before+j)-(j%26));
                    
//                     } else {
//                         afterS += (char)(before+j);
//                     }
                
                afterS += (char)((before+j)-26*((before+j-97)/26));
                
                j++;
            }
            
            answer += afterS.substring(index-1, index);
            
        }
        
        return answer;
    }
}