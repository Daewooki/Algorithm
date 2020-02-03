import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        List<Meeting> meetings = new ArrayList<>();
        
        for(int i=0; i<num; i++){
            Meeting m = new Meeting(sc.nextInt(), sc.nextInt());
            meetings.add(m);
        }
        Collections.sort(meetings, new Comparator<Meeting>(){
            @Override
            public int compare(Meeting m1, Meeting m2){
                if(m1.finish > m2.finish){
                    return 1;
                }else if(m1.finish<m2.finish){
                    return -1;
                }else{
                    if(m1.start>m2.start){
                        return 1;
                    }else if(m1.start<m2.start){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        });
        
        int answer = 0;
        int finish = 0;
        for(int i=0; i<meetings.size(); i++){
            if(finish<=meetings.get(i).start){
                answer++;
                finish = meetings.get(i).finish;
            }
        }
        System.out.println(answer);
    }
}
class Meeting{
    int start;
    int finish;
    public Meeting(int stime, int ftime){
        this.start= stime;
        this.finish = ftime;
    }
}
