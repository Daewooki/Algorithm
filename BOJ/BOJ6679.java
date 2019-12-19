import java.util.*;
public class BOJ6679{
    public static void main(String args[]){
        for(int i=2992; i<=9999; i++){
            if(ten(i) == twelve(i) && twelve(i) == sixteen(i)){
                System.out.println(i);
            }
        }
    }
    
    static int ten(int num){
        int sum = 0;
        while(num>10){
            sum += (num%10);
            num /= 10;
        }
        sum+=num;
        return sum;
    }
    static int twelve(int num){
        int sum = 0;
        while(num>1){
            sum += (num%12);
            num /= 12;
        }
        sum+=num;
        return sum;
    }
    static int sixteen(int num){
        int sum = 0;
        while(num>16){
            sum += (num%16);
            num /= 16;
        }
        sum+=num;
        return sum;
    }
}
