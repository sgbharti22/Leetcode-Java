class Solution {
    public void sortColors(int[] nums) {
        int l,m,h,y,z,t;
        l=m=0;
        h=nums.length-1;
        while(m<=h)
        {
            switch(nums[m])
            {
                case 0:y=m++;z=l++;
                       t=nums[y];
                       nums[y]=nums[z];
                       nums[z]=t;  
                       break;
                case 1:m++;
                        break;
                case 2:y=m;z=h--;
                        t=nums[y];
                        nums[y]=nums[z];
                        nums[z]=t; 
                        break;
            }
        }
    }
}
