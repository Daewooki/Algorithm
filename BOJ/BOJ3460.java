import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        
        for(int i=0; i<cnt; i++){
            int n = sc.nextInt();
            ArrayList<Integer> bit = new ArrayList<>();
            while(n>1){
                bit.add(n%2);
                n = n/2;
            }
            bit.add(1);
            
            for(int j=0; j<bit.size(); j++){
                if(bit.get(j) == 1){
                    System.out.print(j +" ");
                }
            }
        }
    }
}
