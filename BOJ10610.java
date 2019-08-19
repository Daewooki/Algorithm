import java.util.*;
public class BOJ10610{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String num = sc.nextLine();
        
        int len = num.length();
        //count array 0~9 
        int[] numCountArr = new int[10];
        int total = 0;
        for(int i=0; i<len; i++){
            int temp = Integer.parseInt(num.substring(i,i+1));
            numCountArr[temp]+=1;
            total+=temp;
        }
        
        StringBuilder answer=new StringBuilder();
        if(!num.contains("0") || total%3 !=0){
            System.out.println("-1");
        }else{
            for(int i=9; i>=0; i--){
                while(numCountArr[i] >0){
                    answer.append(i);
                    numCountArr[i]--;
                }
            }
        }
        System.out.println(answer);
    }
}
