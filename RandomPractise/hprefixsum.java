import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class hprefixsum {

    public static int findsumMatrix(int arr[][], int r1, int c1, int r2, int c2){
        int sum=0;
        for( int i =r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum += arr[i][j];
            }

        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m= sc.nextInt();

        System.out.println("enter the number of column");
        int n= sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("enter the matrix element");
        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int r1,c1,r2,c2;

        System.out.println("enter the valyue of r1");
        r1 = sc.nextInt();
        System.out.println("enter the valyue of c1");
        c1 = sc.nextInt();
        System.out.println("enter the valyue of r2");
        r2 = sc.nextInt();
        System.out.println("enter the valyue of c2");
        c2 = sc.nextInt();


        

        int result = findsumMatrix(arr,r1,c1,r2,c2);
        System.out.println("some pf element of given rectangle is "+result);


    }
}