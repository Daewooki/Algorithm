import java.util.*;
class BOJ2156{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int array[] = new int[n+1];
        array[0] = 0;
        for(int i=1; i<=n; i++){
            array[i] = sc.nextInt();
        }
        
        long dp[] = new long[n+1];
        dp[0] = 0;
        dp[1] = array[1];
        if(n>1){
            dp[2] = array[1] + array[2];    
        }
        
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-3]+array[i-1]+array[i], dp[i-2]+array[i]);
            dp[i] = Math.max(dp[i-1], dp[i]);
        }
        
        System.out.println(dp[n]);
    }
}
