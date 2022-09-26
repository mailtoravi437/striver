import java.util.*;
import java.lang.*;
import java.io.*;
public class BuyAndSell1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.print(sol(arr));
        }

    }

    public static int sol(int arr[]){
        int min_price = arr[0];
        int ans = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]<min_price){
                min_price = arr[i];
            }
            else{
                ans = Math.max(ans,arr[i]-min_price);
            }
        }

        return ans;
    }
}
