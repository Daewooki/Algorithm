import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        //Collections.reverse(list);
        if(list.size()>0){
            int sum= 0;
            int temp= 0;
            for(int i =0; i<list.size(); i++){
                temp += list.get(i);
                sum+=temp;
            }
            System.out.println(sum);
        }
    }
}
