//you can also use imports, for example:
import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

//greedy back tracking

class Solution {
 public String solution(int U, int L, int[] C) {
     // write your code in Java SE 8
     String result = "";
     int[][] array = new int[2][C.length];
     int total = U+L;
     int sum = 0;
     
     for(int i=0; i<C.length; i++){
         if(C[i]==2){
             array[0][i] = 1;
             array[1][i] = 1;
             sum+=2;
             
             U--;
             L--;
         }
     }
     for(int i=0; i<C.length; i++){
         if(C[i]==1){
             if(U>=L){
                 array[0][i] = 1;
                 sum++;
                 U--;
             }else{
                 array[1][i] = 1;
                 sum++;
                 L--;
             }    
         }
     }
   
     
     if(sum != total){
         result = "IMPOSSIBLE";
     }else{
         StringBuilder sb = new StringBuilder();
         for(int i=0; i<array[0].length; i++){
             sb.append(array[0][i]+"");
         }
         sb.append(",");
         for(int i=0; i<array[1].length; i++){
             sb.append(array[1][i]+"");
         }
         result = sb.toString();
     }
     
     return result;
 }
}
