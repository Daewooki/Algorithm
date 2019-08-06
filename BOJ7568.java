import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Person p = new Person(height, weight);
            list.add(p);
        }
        for(int i=0; i<list.size(); i++){
            Person p1 = list.get(i);
            int k=0;
            for(int j=0; j<list.size(); j++){
                if(i!=j){
                    Person p2 = list.get(j);
                    if(p2.height >p1.height && p2.weight>p1.weight){
                        k++;
                    }
                }
            }
            System.out.print((k+1)+" ");
        }
    }
}
class Person{
    int height;
    int weight;
    public Person(int height, int weight){
        this.height=height;
        this.weight=weight;
    }
}
