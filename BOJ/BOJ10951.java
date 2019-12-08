import java.util.*;
import java.io.*;
public class BOJ10951{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String reader = "";
        String field[];
        
        while((reader=br.readLine())!=null){
            field = reader.split(" ");
            System.out.println((Integer.parseInt(field[0]) + Integer.parseInt(field[1])));
        }
        br.close();
    }
}
