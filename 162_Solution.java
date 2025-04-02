class Solution {
    public int findPeakElement(int[] nums) {
        int min=0; int max=nums.length-1;
        while (min<max){
            int mid = min + (max-min)/2;
            if(mid+1 < nums.length && nums[mid]>nums[mid+1]){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
}
