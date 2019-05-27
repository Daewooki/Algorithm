import java.io.*;


public class BOJ1978{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String reader = br.readLine();
        
        String field[];
        field = reader.split(" ");
        
        int answer = 0;
        for(int i=0; i<field.length; i++){
            int cnt = 0;
            int num = Integer.parseInt(field[i]);
            for(int j = 1; j<=num; j++){
                if((Integer.parseInt(field[i]) % j)==0){
                    cnt++;
                }
            }
            if(cnt==2){
                answer++;
            }
        }
        
        System.out.println(answer);
        br.close();
    }
}
