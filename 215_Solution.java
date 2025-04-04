class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        int ans=-1;

        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        while(min<=max){
            int mid = min + (max - min)/2;
            if(count(nums,mid)<k){
                max=mid-1;
            }
            else{
                ans=mid;
                min=mid+1;
            }
        }
        return ans;
        
    }

    public static int count(int nums[], int mid){
        int count=0;
        for(int i:nums){
            if( i >= mid){
                count++;
            }
        }
        return count;
    }
}
