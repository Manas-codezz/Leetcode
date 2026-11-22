class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int target=-1;
        int lar=-1;
        List<Boolean> ans = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            if (candies[i]>lar){
            lar=candies[i];
            }

        }
        target=lar-extraCandies;
        for (int i=0;i<candies.length;i++){
            if (candies[i]>=target){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}