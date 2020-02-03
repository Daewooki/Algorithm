import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int obj = sc.nextInt();
        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }
        int diffMin = Integer.MAX_VALUE;
        int answer = 0;
        for(int i=0; i<list.size()-2; i++){
            int a = list.get(i);
            for(int j=i+1; j<list.size()-1; j++){
                int b = list.get(j);
                for(int k=j+1; k<list.size(); k++){
                    int c = list.get(k);
                    int sum = a+b+c;
                    if(sum<=obj && Math.abs(obj-sum)<diffMin){
                        diffMin = Math.abs(obj-sum);
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
