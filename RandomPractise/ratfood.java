// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area,
// ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i.
// Note:
// Return -1 if the array is null.
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
// Example:
// Input:
// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2
// Output:
// 4
// Explanation:
// Total amount of food required for all rats = r * unit
// = 7 * 2 = 14.
// The amount of food in 1st houses = 2+8+3+5 = 18. Since, the amount of food in 1st 4 houses is sufficient for all the rats. Thus, output is 4.
/**
 * ratfood
 */
public class ratfood {

    static int count(int[] arr,int n, int r, int unit){
        int sum = 0, i = 0;
        int res = r*unit;
        for(i = 0; i < n; i++){
            sum += arr[i];
            if(sum >= res){
                return i+1;
            }
        }
        if(i == n) return -1;
        return i+1;
    }
    public static void main(String[] args) {
        int n = 8;//number of array elements
        int[] arr = {2,8,3,5,7,4,1,2};//array elements
        int r = 7;//number of rats
        int unit = 2;//
        int res = count(arr, n, r, unit);
        System.out.println(res);
    }
}