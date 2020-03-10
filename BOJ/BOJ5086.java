import java.io.*;
import java.util.*;

class BOJ5086{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String reader="";
        String field[];
        
        while((reader=br.readLine())!=null){
            boolean factor = false;
            boolean multiple = false;
            if(reader.startsWith("0 0")){
                break;
            }else{
                field =reader.split(" ");
                
                int a = Integer.parseInt(field[0]);
                int b = Integer.parseInt(field[1]);
                if(b<a && (a % b == 0)){
                    multiple = true;
                }
                if(b>a && (b % a == 0)){
                    factor = true;
                }
                
                if(multiple ==false && factor ==false){
                    System.out.println("neither");
                }else if(multiple == false){
                    System.out.println("factor");
                }else if(factor == false){
                    System.out.println("multiple");
                }
            }
        }
        br.close();
    }
}
