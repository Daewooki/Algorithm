import java.util.Scanner;
public class BOJ1924 {
       public static void main(String args[]) {
              Scanner sc = new Scanner(System.in);
              int month, day;
              month = sc.nextInt();
              day = sc.nextInt();
              
              String seven[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
              int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
              
              int sum = 0;
              
              for(int i = day; i>=1; i--) {
            	  sum++;
              }
              if(month==1) {
            	  System.out.println(seven[sum%7]);
              }else {
            	  for(int i=month-1; i>=1; i--) {
            		  sum += days[i];
            	  }
            	  System.out.println(seven[sum%7]);
              }
       }
}
