import java.util.*;
class BOJ1920{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int arr[] = new int[num];
        
        for(int i=0; i<num; i++){
            arr[i]= sc.nextInt();
        }
        // binary search를 위한 정렬
        Arrays.sort(arr);
        num = sc.nextInt();
        int comp[] = new int[num];
        for(int i=0; i<num; i++){
            comp[i] = sc.nextInt();
        }
        
        for(int i=0; i<comp.length; i++){
            if(binarySearch(comp[i], arr)==true){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
               
        }
    }
    static boolean binarySearch(int comp, int arr[]){
        int min = -1;
        int max = arr.length;
        int middle;
        
        while(max-min>1){
            middle = (min+max)/2;
            if(comp == arr[middle]){
                return true;
            }else if(comp > arr[middle]){
                min = middle;
            }else if(comp < arr[middle]){
                max = middle;
            }
        }
        return false;
    }
}
