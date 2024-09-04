public class magical {
    static boolean isMagical(int a){
        int count = 0;
        while(a>0){
            if((a&1) == 0) count++;
            a=a<<1;
        }
        if(count % 2 == 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        // isMagical(2);
        // System.out.println(isMagical(2));
        int n = 5;
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(isMagical(i)==true) count++;
        }
        System.out.println("There are "+count+" magical numbers");
    }
}
