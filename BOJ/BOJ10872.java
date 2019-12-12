import java.util.*;
public class BOJ10872{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int answer = 1;
        
        for(int i=n; i>0; --i){
            answer *= i;
        }
        
        System.out.println(answer);
    }
}
