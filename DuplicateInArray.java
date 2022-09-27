import java.util.*;
import java.lang.*;
import java.io.*;
public class DuplicateInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = sol(arr);
        System.out.println(ans);
    }

    public static int sol(int arr[]){
        int n = arr.length;
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0;i<n;i++){
            if(hset.contains(arr[i])){
                return arr[i];
            }

            hset.add(arr[i]);
        }

        return -1;
    }
}
