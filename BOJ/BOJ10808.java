import java.util.*;
public class BOJ10808{
    public static void main(String args[]){
        int alpha[] = new int[26];
        
        Scanner sc = new Scanner(System.in);
        
        String seq = sc.nextLine();
        
        for(int i=0; i<seq.length(); i++){
            alpha[seq.charAt(i)-'a']++;
        }
        for(int i=0; i<alpha.length; i++){
            System.out.print(alpha[i]+" ");
        }
    }
}
