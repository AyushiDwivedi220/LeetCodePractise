public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        

        while(low<=high){
            int mid=low +(high-low)/2;
            if(isBadVersion(mid)&& !isBadVersion(mid-1)){
                return mid;
            }
            if(!isBadVersion(mid)){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return -1;
    }
}
