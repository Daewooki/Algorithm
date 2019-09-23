import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int result = 0;
        if(S == null){
            result = 0;
        }else if(S.length() < 3){
            result = S.length();
        }else if(S.length() >= 3){
            int preIdx = 0;
            for(int i=2; i<S.length(); i++){
                if(S.charAt(i) == S.charAt(i-2) && S.charAt(i) == S.charAt(i-1)){
                    preIdx = i-1;
                }
                result = Math.max(result,i-preIdx+1);
            }
        }
        return result;
    }
}


// 맞는지 모르겠군,, 2번은 바로 제출하느라 코드를 복사한게 없음.
