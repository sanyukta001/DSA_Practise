//recursive binary search
import java.util.*;
public class recbinarysearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        recbinarysearch ob = new recbinarysearch();
        int arr[] = new int [5];
        System.out.println("Enter the elements");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int s = sc.nextInt();
        int lb = 0, ub = 4;
        int pos = ob.bsearch(arr,ub,lb,s);
        if(pos != -1)
        {
            System.out.println("Element found at position "+(pos+1));
        }
        else
        {
            System.out.println("Element not found");
        }
        sc.close();

    }

    int bsearch(int arr[],int ub,int lb,int s)
    {
        int mid = lb+(ub-lb)/2;
        if(lb>=ub)
            return -1;
        if(arr[mid] == s)
            return mid;
        else if(arr[mid] < s)
            return bsearch(arr,ub,mid+1,s);
        else
            return bsearch(arr,mid-1,lb,s);

    }
}
