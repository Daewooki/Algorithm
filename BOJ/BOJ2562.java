import java.util.*;
public class BOJ2562{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int maxIdx = 0;
        for(int i=0; i<9; i++){
            int num = sc.nextInt();
            if(max<num){
                maxIdx = i;
                max = num;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx+1);
    }
}
