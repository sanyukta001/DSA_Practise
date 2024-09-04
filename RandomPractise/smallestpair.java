public class smallestpair {
    static int check(int[] num, int sum, int n){
        for(int i = 0; i < n; i++){
            int min=i;
            for(int j = i+1;j<n ;j++){
                if(num[min]>num[j])
                    min = j;
            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        if(num[0]+num[1]<=sum) return num[0]*num[1];
        return 0;
    }
    public static void main(String[] args) {
        int[] num = {5,2,4,3,9,7,1};
        int sum = 9;
        int n = 7;
        int res = check(num,sum,n);
        System.out.println(res);
    }
}
