//iterative binarysearch
import java.util.*;
public class binarysearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int [5];
        System.out.println("Enter the elements");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int s = sc.nextInt();
        int lb = 0, ub = 4, mid = 0;
        int flag = 0, pos = 0;
        while(lb<=ub)
        {
            mid = lb+(ub-lb)/2;
            if(arr[mid] == s)
            {
                flag = 1;
                pos = mid;
                break;
            }

            else if(arr[mid] < s)
            {
                lb = mid + 1;
            }

            else
            {
                ub = mid - 1;
            }
        }

        if(flag == 1)
        {
            System.out.println("Element found at position "+(pos+1));
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();

    }
}