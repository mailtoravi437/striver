import java.util.*;
import java.lang.*;
import java.io.*;
public class MergeIntervals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x[] = new int[n];
            int end[] = new int[n];

            for(int i=0;i<n;i++){
                x[i] = sc.nextInt();
            }

            for(int i=0;i<n;i++){
                end[i] = sc.nextInt();
            }

            Interval interval[] = new Interval[n];
            for(int i=0;i<n;i++){
                interval[i] = new Interval(x[i], end[i]);
            }

            List<Interval> alist = sol(interval);
            for(int i=0;i<alist.size();i++){
                System.out.print(alist.get(i).x+" "+alist.get(i).y);
            }
        
    }

    public static List<Interval> sol(Interval intervals[]){
        int n = intervals.length;
        List<Interval> res = new ArrayList<>();
        Arrays.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                if(a.x==b.x){
                    return a.y-b.y;
                }
                
                return a.x-b.x;
            }
        });
        
        for(int i=0;i<n;i++){
            int currS = intervals[i].x;
            int currE = intervals[i].y;
            
            if(res.size()==0 || res.get(res.size()-1).y<currS){
                res.add(intervals[i]);
            }
            else{
                res.get(res.size()-1).y = Math.max(currE,res.get(res.size()-1).y);
            }
        }
        
        return res;
        
    }
}

class Interval{
    int x;
    int y;
    Interval(int x,int y){
        this.x = x;
        this.y = y;
    }
}
