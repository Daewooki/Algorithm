import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<line; i++){
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        
        int answer = 0;
        
        int idx =0;
        while(num!=0){
            if(num<list.get(idx)){
                idx++;
            }else{
                int div = list.get(idx);
                int cnt = num/div;
                num-= cnt*div;
                idx++;
                answer +=cnt;
            }
        }
        System.out.println(answer);
    }
}
