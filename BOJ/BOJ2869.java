import java.util.*;
public class BOJ2869{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        
        System.out.println((V-B-1)/(A-B) + 1);
    }
}
