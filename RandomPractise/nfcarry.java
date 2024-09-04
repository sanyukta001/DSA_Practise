public class nfcarry {
    public static void main(String[] args) {
        int num1 = 451;
        int num2 = 349;
        int carry = 0, carryCount =0;
        while(num1>0 && num2>0){
            int d1 = num1%10;
            int d2 = num2%10;
            num1 /= 10;
            num2 /= 10;
            int sum = d1+d2+carry;
            if(sum > 9)
            {
                carry = sum/10;
                carryCount++;
            }
        }
        while(num1>0){
            int sum = carry+num1%10;
            num1 /= 10;
            if(sum > 9){
                carry=sum/10;
                carryCount++;
            }
        }
        while(num2>0){
            int sum = carry+num2%10;
            num2 /= 10;
            if(sum > 9){
                carry=sum/10;
                carryCount++;
            }
        }
        System.out.println(carryCount + "times");
    }
}
