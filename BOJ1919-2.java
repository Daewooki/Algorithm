import java.util.Scanner;
public class Main {
       public static void main(String args[]) {
              Scanner sc = new Scanner(System.in);
              String a = sc.nextLine();
              String b = sc.nextLine();
              int alphabeta[]= new int[26];
              int alphabetb[]= new int[26];
              int count =0;
                     
              char ca[]= a.toCharArray();
              char cb[] = b.toCharArray();
                           
              for(int i=0; i<ca.length; i++) {
                     alphabeta[ca[i]-97]++;
              }
                           
              for(int i=0; i<cb.length; i++) {
                     alphabetb[cb[i]-97]++;
              }
                           
              for(int i=0; i<alphabeta.length; i++) {
                     System.out.println(alphabeta[i] + " " + alphabetb[i]);
                     
                     if(alphabeta[i] > alphabetb[i]) {
                           count = count + (alphabeta[i] - alphabetb[i]);
                     }
                     else {
                           count = count + (alphabetb[i] - alphabeta[i]);
                     }
              }             
              System.out.println(count);
              
       }
}
