public class median {
    public static void main(String[] args) {
        int[] arr = {1};
        int n = arr.length;
        int pos = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] > 0) pos++;
        if(pos % 2 == 0) pos = pos/2;
        else pos = (pos/2) + 1;
        int i = 0;
        while (pos != 0) {
            if(arr[i] > 0) pos--;
            i++;
        }
        System.out.println("The media positive element is "+arr[i-1]);
    }
}
