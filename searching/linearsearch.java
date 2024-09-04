import java.util.*;
public class linearsearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int s = sc.nextInt();
        sc.close();
        int flag = 0;
        int i;
        for (i = 0; i < arr.length; i++) 
        {
            if(arr[i] == s)
            {
                flag = 1;
                break;
            }
            
        }
        if(flag == 1)
        {
            System.out.println("Element found at position "+(i+1));
        }
        else
        {
            System.out.println("Element not found");
        }
        
        //********modified linear search*******

    //     int flag = -1;
    //     int i = 0, j = 5-1;
    //     while(i<j)
    //     {
    //         if(arr[i++] == s)
    //         {
    //             flag = i;
    //             break;
    //         }
    //         if(arr[j--] == s)
    //         {
    //             flag = j+2;
    //             break;
    //         }
    //     }
    //     if(flag != -1)
    //     {
    //         System.out.println("Element found at position "+flag);
    //     }
    //     else
    //     {
    //         System.out.println("Element not found");
    //     }
         
     }
   
}
