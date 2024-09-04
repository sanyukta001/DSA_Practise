import java.util.*;
class rps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose 0 for rock, 1 for paper, 2 for scissors");
        int ch = sc.nextInt();
        int ch1 = (int)((Math.random() * (2 - 0)) + 0);
        switch(ch)
        {
            case 0:
                    if(ch1 == 0)
                    {
                        System.out.println("Computer: Rock\nYou:Rock");
                        System.out.println("match draw");
                    }
                    else if(ch1 == 1)
                    {
                        System.out.println("Computer: Paper\nYou:Rock");
                        System.out.println("loose!!");
                    }
                    else
                    {
                        System.out.println("Computer: Scissors\nYou:Rock");
                        System.out.println("winn!!!");
                    }
                break;
            case 1:
                    if(ch1 == 0)
                    {
                        System.out.println("Computer: Rock\nYou:Paper");
                        System.out.println("winnn!!");
                    }
                    else if(ch1 == 1)
                    {
                        System.out.println("Computer: Paper\nYou:Paper");
                        System.out.println("match draw");
                    }
                    else
                    {
                        System.out.println("Computer: Scissors\nYou:Paper");
                        System.out.println("loosee!!!");
                    }
                break;
            case 2:
                    if(ch1 == 0)
                    {
                        System.out.println("Computer: Rock\nYou:Scissors");
                        System.out.println("loosee!!");
                    }
                    else if(ch1 == 1)
                    {
                        System.out.println("Computer: Paper\nYou:Scissors");
                        System.out.println("winnn!!");
                    }
                    else
                    {
                        System.out.println("Computer: Scissors\nYou:Scissors");
                        System.out.println("match draw");
                    }
                break;
            default:System.out.println("Wrong choice");
        }
    }
}