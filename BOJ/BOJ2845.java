import java.util.*;
public class BOJ2845{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m2 = sc.nextInt();
        int area = sc.nextInt();
        
        int total = m2 * area;
        
        for(int i=0; i<5; i++){
            int news = sc.nextInt();
            System.out.print(news - total + " ");
        }
    }
}
