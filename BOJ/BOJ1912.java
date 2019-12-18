import java.util.*;
public class BOJ1912{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int[] array = new int[num];
        
        for(int i=0; i<num;i++){
            array[i] = sc.nextInt();
        }
        
        int[] dp = new int[num];
        dp[0] = array[0];
        
        int max = dp[0];
        for(int i=1; i<num; i++){
            dp[i] = Math.max(array[i], (dp[i-1] + array[i]));
            if(max < dp[i]){
                max = dp[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
