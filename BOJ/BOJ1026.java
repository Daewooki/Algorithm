import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i=0; i<num; i++){
            a.add(sc.nextInt());
        }
        for(int i=0; i<num; i++){
            b.add(sc.nextInt());
        }
        Collections.sort(a);
        Collections.sort(b);
        Collections.reverse(b);
        
        int s = 0;
        for(int i=0; i<a.size(); i++){
            s += (b.get(i) * a.get(i));
        }
        System.out.println(s);
    }
}
