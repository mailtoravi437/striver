import java.util.*;
import java.lang.*;
import java.io.*;
public class RotateMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sol(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }
    }

    public static void sol(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;

        int rowStart = 0;
        int colStart = 0;

        while(rowStart<n && colStart<m){
            if(rowStart==n-1 || colStart==m-1){
                break;
            }

            previous = arr[rowStart+1][colStart];
            
        }

        for(int i)
    }
}
