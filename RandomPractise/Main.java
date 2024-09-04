import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
    // Write your code here

    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
        int eventotal=0;
    int oddtotal=0;
    while(n>0)
    {   
      int Digit = n%10;
      if(Digit%2==0){
        eventotal += Digit;
      }
      else if (Digit%2!=0){
        oddtotal +=Digit;
      }n/=10;

    }
    
        System.out.print(eventotal+ " ");
        
        System.out.print(oddtotal);
  }
  
}