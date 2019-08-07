import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer;
        for(int i=1; i<num; i++){
            String s = String.valueOf(i);
            int length = s.length();
            int sum = i;
            for(int j =0; j<length; j++){
                sum+= s.charAt(j)-48;
            }
            if(sum==num){
                answer = i;
                System.out.println(answer);
                return;
            }
        }
        System.out.println("0");
    }
}
