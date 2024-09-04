// The Binary number system only uses two digits, 0 and 1 and the number system can be called binary string. You are required to implement the following function:
// int OperationsBinaryString(char* str);
// The function accepts a string str as its argument. The string str consists of binary digits separated with an alphabet as follows:
// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation
// You are required to calculate the result of the string str, scanning the string to right taking one operation at a time, and return the same.
// Note: No order of priorities of operations is required.
// Length of str is odd.
// If str is NULL or None (in case of Python), return -1.
// Input:
// 1C0C1C1A0B1
// Output:
// 1
public class binaryoperation {

    static int OperationsBinaryString(String str){
        int a = -1,b = -1;
        a=(str.charAt(0)=='0')?0:1;
        for(int i = 1; i < str.length()-1; i++){
            char x = str.charAt(i);
            if (x!='0'&&x!='1') {
                b=(str.charAt(i+1)=='0')?0:1;
                if(x=='A'){
                    a=a&b;
                }
                else if(x=='B'){
                    a=a|b;
                }
                else{
                    a=a^b;
                }
            }
        }
        if(a!=-1) return a;
        return -1;
    }
    public static void main(String args[]){
        String str="1C0C1C1A0B1";
        int a = OperationsBinaryString(str);
        System.out.println(a);
    }
}
