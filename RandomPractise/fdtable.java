import java.util.*;
public class fdtable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int [n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("x"+i+"=");
            x[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print("y"+i+"=");
            y[i] = sc.nextInt();
        }
        int c = 0;
        System.out.println("Here the value of h is "+(x[1]-x[0]));
        while(n!=1)
        {
            n--;
            for(int i = 0; i < n; i++)
            {
                y[i] = y[i+1] - y[i]; 
            }
            c++;
            System.out.println("Table of del"+c+"f(x) is:");
            for(int i = 0; i < n; i++)
            {
                System.out.println(y[i]);
            }
        }
    }
}