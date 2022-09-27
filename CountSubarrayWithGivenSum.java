import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = sol(arr,x);
        System.out.println(ans);
    }

    public static int sol(int arr[],int x){
        int n = arr.length;
        int ans = 0;

        HashMap<Integer,Integer> hmap = new hashMap<>();
        hmap.put(0,1);
        int currXor = 0;

        for(int i=0;i<n;i++){
            currXor = currXor^arr[i];
            int req = currXor^x;

            if(hmap.containsKey(req)){
                ans += hmap.get(req);
            }

            hmap.put(currXor,hmap.getOrDefault(currXor,0)+1);
        }

        return ans;
    }
}

