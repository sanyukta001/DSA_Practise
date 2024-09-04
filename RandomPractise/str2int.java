import java.util.*;
    class str2int
    {
        public static int myAtoi(String s) 
        {
            int x = 1;
            int num = 0;
            for(int i = 0; i < s.length();i++)
            {
                char ch = s.charAt(i);
                System.out.print(ch+"--");
                if(ch == ' ')
                    continue;
                else if(ch == '-')
                    x = x*-1;
                else
                {
                    if(Character.isDigit(ch))
                    {
                        num = num*10 + (int)(ch - 48);
                        System.out.print(num+" ");
                    }
                }
            }
            num = num*x;
            return num;
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int res = myAtoi("42");
            System.out.println("result is "+res);
        }
    }
