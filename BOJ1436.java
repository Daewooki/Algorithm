import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int cnt = 1;
        int num = 666;
        while(cnt!=N){
            num++;
            String s = String.valueOf(num);
            if(s.contains("666")){
                cnt++;
            }
        }
        System.out.println(num);
    }
}
