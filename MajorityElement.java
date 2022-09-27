import java.util.*;
import java.lang.*;
import java.io.*;
public class MajorityElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = sol(arr);
    }

    public static int sol(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            hmap.put(arr[i], hmap.get(arr[i],0)+1);

            if(hmap.get(arr[i])>n/2){
                return arr[i];
            }
        }

        return -1;
    }
}
