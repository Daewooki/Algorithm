import java.util.*;
public class BOJ1712{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int base = sc.nextInt();
        int pay = sc.nextInt();
        int price = sc.nextInt();
        
        if(pay>=price){
            System.out.println("-1");
        }
        else{
            System.out.println(base/(price-pay)+1);
        }
    }
}
