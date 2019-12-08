import java.util.*;
public class BOJ10818{
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            numbers.add(sc.nextInt());
        }
        
        System.out.println(Collections.min(numbers) + " " + Collections.max(numbers));
        sc.close();
    }
}
