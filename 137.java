class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
         int ans=0;
         for(int i=0;i<nums.length;i++)
         {

             if(!hm.containsKey(nums[i]))
             {
                 hm.put(nums[i],1);
             }
             else
             {
                 int t=hm.get(nums[i]);
                 t=t+1;
                 hm.put(nums[i],t);
             }
         }
         for(Map.Entry<Integer,Integer> e:hm.entrySet())
         {
		 if(e.getValue()==1) 
         {
             ans=e.getKey();
         }
	     }
         return ans;
    }
}
