public class recursion
{
    public static void main(String[] args)throws InterruptedException
    {
        while(true)
        {
            System.out.print("H");
            Thread.sleep(200);
            System.out.print("I"+" ");
            Thread.sleep(200);
            System.out.print("J");
            Thread.sleep(200);
            System.out.print("A");
            Thread.sleep(200);
            System.out.print("N");
            Thread.sleep(200);
            System.out.print("U");
            Thread.sleep(200);
            System.out.print(" ");
            Thread.sleep(1000);//wait for 1 sec before strating the next heartbeat
            System.out.print("\b\b\b\b\b\b\b\b");//move the cursor back five spaces to overwrite the previous "crush"
        }
    }
}