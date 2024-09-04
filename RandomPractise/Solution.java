class Solution {
    public static void main(String[] args){
        int nums[] = {2,3,-5};
        int x = returnToBoundaryCount(nums);
        System.out.println(x);
    }
    public static int returnToBoundaryCount(int[] nums) {
        int j = 0;
        int c = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                j = j - nums[i];
                if(j == 0)
                {
                    c++;
                }
            }
            else
            {
                j = j + nums[i];
                if(j == 0)
                {
                    c++;
                }
            }
            System.out.println("j="+j+" "+"c="+c);
        }
        // if(j==0)
        //     c++;
        return c;
    }
}
//nb=