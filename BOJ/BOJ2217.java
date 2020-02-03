import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        int weight = 0;
        int max = 0;
        for(int i=0; i<list.size(); i++){
            int w = list.get(i) * (i+1);
            if(max<w){
                max = w;
            }
        }
        System.out.println(max);
    }
}
