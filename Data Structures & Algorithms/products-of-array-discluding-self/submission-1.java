class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        //O(n)
        /*
        1 2 4 6

        pref: 1 X X X
        suff: X X X 1
        
        pref: 1  1 2 8
        suff: 48 24 6 1
        */


        //O(n^2)
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            products[i] = product;
        }
        return products;
    }
}  
