import java.util.Scanner;
public class Main {
       public static void main(String args[]) {
              Scanner sc = new Scanner(System.in);
              int num = Integer.parseInt(sc.nextLine());
              String n = sc.nextLine();
              char ar[] = n.toCharArray();
             
              int sum = 0;
              for(int i=0; i<num; i++) {
            	  sum += ar[i]-'0';
              }
              
              System.out.println(sum);
              sc.close();
              
       }
}

