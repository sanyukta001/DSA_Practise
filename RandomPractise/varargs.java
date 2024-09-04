import java.util.*;
class varargs
{
    static int sum(int ...arr)
    {
        int s = 0;
        for(int a:arr)
            s = s + a;
        return s;
    }
    public static void main(String argr[])
    {
        System.out.println("Finding sums are");
        System.out.println("sum of nothing is "+sum());
        System.out.println("sum of 1 is "+sum(1));
        System.out.println("sum of 1,2 is "+sum(1,2));
        System.out.println("sum of 1,2,3 is "+sum(1,2,3));
        System.out.println("sum of 1,2,3,4 is "+sum(1,2,3,4));   
    }
}