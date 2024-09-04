import java.util.*;
public class selection 
{
    int ar[];
    public static void main(String[] args) 
    {
        selection ob = new selection();
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the number os elements");
        int n = sc.nextInt();
        ob.ar = new int[n];
        ob.input();
        ob.selectsort();
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
    public void selectsort()
    {
        for (int i = 0; i < ar.length-1; i++) 
        {
            int min = i;
            for (int j = i+1; j < ar.length; j++) 
            {
                if(ar[j]<ar[min])
                    min = j;    
            }
            int t = ar[i];
            ar[i] = ar[min];
            ar[min] = t;
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
