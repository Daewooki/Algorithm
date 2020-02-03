import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        int answer = 0;
        
        String field[];
        
        field = exp.split("\\-");
        
        String part[];
        part = field[0].split("\\+");
        for(int i=0; i<part.length; i++){
            answer += Integer.parseInt(part[i]);
        }
        
        for(int i=1; i<field.length; i++){
            part = field[i].split("\\+");
            int sum = 0;
            for(int j=0; j<part.length; j++){
                sum += Integer.parseInt(part[j]);
            }
            answer-=sum;
        }
        System.out.println(answer);
    }
}
