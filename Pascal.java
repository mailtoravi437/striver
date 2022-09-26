import java.util.*;
import java.lang.*;
import java.io.*;
public class Pascal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = sol(n);
        System.out.println(ans);
        }
    }

    public static ArrayList<ArrayList<Integer>> sol(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    temp.add(1);
                }else{
                    temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }

            ans.add(temp);
        }

        return ans;
    }
}
