class Solution {
    public int findGCD(int[] nums) {
      int min=nums[0];
      int max=nums[0];

      for(int n:nums)
      {
        if(n<min)
        min=n;
        if(n>max)
        max=n;
      }  

      while(min!=max)
      {
        if(min>max)
        min-=max;
        else
        max-=min;
      }
      return min;
    }
}