import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        
        int total = 1000;
        int remain = total - input;
        
        int answer = 0;
        
        int coin[] = {500,100,50,10,5,1};
        int idx = 0;
        while(remain!=0){
            int div = remain/coin[idx];
            answer+=div;
            remain-=(coin[idx]*div);
            idx++;
        }
        System.out.println(answer);
    }
}
