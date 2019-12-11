import java.util.*;
public class BOJ3052{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            int rem = num%42;
            map.put(rem,1);
        }
        
        System.out.println(map.size());
        
        sc.close();
    }
}
