import java.util.*;
public class BOJ2581{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=m; i<=n; i++){
            if(sosu(i)){
                sum+=i;
                if(min>i){
                    min = i;
                }
            }
        }
        
        if(sum==0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
    static boolean sosu(int num){
        if(num<2){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
