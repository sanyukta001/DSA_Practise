import java.util.*;
public class bubblesort 
{
    int ar[];
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        bubblesort ob = new bubblesort();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        ob.ar = new int [n];
        ob.input();
        ob.bubble(); 
        System.out.println("The sorted array is");
        ob.display();
        sc.close();
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i = 0; i < this.ar.length; i++) 
        {
            this.ar[i] = sc.nextInt();
        }
        sc.close();
    }
    public void bubble()
    {
        for (int i = 0; i < ar.length-1; i++) 
        {
            for (int j = 0; j < ar.length-1-i; j++) 
            {
                if(ar[j]>ar[j+1])
                {
                    int t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
    }
    public void display()
    {
        for (int i = 0; i < ar.length; i++) 
        {
            System.out.print(ar[i]+" ");  
        }
    }

}