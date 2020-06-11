import java.util.*;
class BOJ5543{
    public static void main(String args[]){
        ArrayList<Integer> hambuger = new ArrayList<>();
        ArrayList<Integer> drink = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            hambuger.add(sc.nextInt());
        }
        
        for(int i=0; i<2; i++){
            drink.add(sc.nextInt());
        }
        
        System.out.println(Collections.min(hambuger)+Collections.min(drink)-50);
    }
}
