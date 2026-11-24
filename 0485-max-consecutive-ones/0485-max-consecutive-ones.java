class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {  
        int maxi=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            if (nums[j]==1){
                count++;
                continue;
            }else
            maxi=Math.max(maxi,count);
            count=0;
        }
        maxi=Math.max(maxi,count);
         return maxi;
       }
   
    }
