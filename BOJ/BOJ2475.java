import java.util.*;

public class Main{
    public static void main(String args[]){
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            numList.add(sc.nextInt());
        }
        int sum = 0;
        for(int i=0; i<numList.size(); i++){
            sum += numList.get(i)*numList.get(i);
        }
        int result = sum %10;
        System.out.println(result);
    }
}
