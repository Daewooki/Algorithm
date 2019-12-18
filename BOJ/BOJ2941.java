import java.util.*;
import java.io.*;
public class BOJ2941{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        String seq = br.readLine();
        
        int answer = 0;
        
        for(int i = 0; i<array.length; i++){
            if(seq.contains(array[i])){
                seq = seq.replaceAll(array[i], "*");
            }
        }
        
        
        System.out.println(seq.length());
    }
}
