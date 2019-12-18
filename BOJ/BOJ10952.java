import java.util.*;
import java.io.*;
public class BOJ10952{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String reader = "";
        String field[];
        while((reader = br.readLine())!=null){
            if(reader.equals("0 0")){
                break;
            }else{
                field = reader.split(" ");
                int a = Integer.parseInt(field[0]);
                int b = Integer.parseInt(field[1]);
                
                System.out.println(a+b);
            }
        }
        
        br.close();
    }
}
