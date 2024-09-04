import java.util.Scanner;
class patterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /*
        ####
        ###
        ##
        #
        */
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // for(int i = 1; i <= n; i++)
        // {
        //     for(int j = n; j >= i; j--)
        //     {
        //         System.out.print("#");
        //     }
        //     System.out.println();
        // }
        /*
        #
        ##
        ###
        ####
        */
        // System.out.println("Enter the number");
        // int n1 = sc.nextInt();
        // for(int i = 1; i <= n1; i++)
        // {
        //     for(int j = 1; j <=i ; j++)
        //     {
        //         System.out.print("#");
        //     }
        //     System.out.println();
        // }
        /*
         #
        # #
       # # #
        # #
         #
        */
        // for(int i = 1; i <= n; i++)
        // {
        //     for(int j = n-1; j >= i; j--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1;j <= i;j++)
        //     {
        //         if(j==1 || j==i)
        //         System.out.print(" #");
        //         else
        //             System.out.print("  ");
        //     }
        //      for(int j = n-1; j >= i; j--)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j = 1;j <= i;j++)
        //     {
        //         if(j==1 || j==i)
        //         System.out.print(" #");
        //         else
        //             System.out.print("  ");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i <= n-1; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j = n-1;j >= i; j--)
        //     {
        //         if(j==n-1 || j==i)
        //         System.out.print(" #");
        //         else
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j = n-1;j >= i; j--)
        //     {
        //         if(j==n-1 || j==i)
        //         System.out.print(" #");
        //         else
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        // }

        /***********heart pattern************/
        for(int i = 1; i <= n; i++)
        {
            for(int j = n-1; j >= i; j--)
            {
                System.out.print(" ");
            }
            if(i==1 || i==2)
            {
                System.out.println();
                continue;
            }
            for(int j = 1;j <= i;j++)
            {
                if(i==3)
                    System.out.print(" *");
                else if(j==1 || j==i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
             for(int j = n-1; j >= i; j--)
            {
                System.out.print("  ");
            }
            for(int j = 1;j <= i;j++)
            {
                if(i==3)
                    System.out.print(" *");
                else if(j==1 || j==i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i = 1;i <= n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            for(int j = n-1;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int j = n;j>=i;j--)
            {
                if(j==i)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}