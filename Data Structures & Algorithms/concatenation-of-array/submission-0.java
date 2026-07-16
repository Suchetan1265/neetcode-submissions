class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans [] = new int [2*nums.length]; 
        int i=0;
        int c=0;   
        while (i<ans.length)
        {
            if(i==nums.length)
              {  
                c=i;
              }
            ans [i] = nums [i-c];
            i++;

        }
        return ans;
    }
}