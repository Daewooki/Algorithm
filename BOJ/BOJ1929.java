import java.util.*;
public class BOJ1929{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int array[] = new int[n+1];
        
        for(int i=0; i<=n; i++){
            array[i] = 0;
        }
        array[1] = 1;
        
        for(int i=2; i<=n; i++){
            for(int j=2; i*j<=n; j++){
                array[i*j] = 1;
            }
        }
        
        for(int i=m; i<=n; i++){
            if(array[i] != 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
