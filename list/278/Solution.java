public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long left = 1;
        long right = n;
        while(left < right){
            int m = (int)((left+right) >> 1);
            if(isBadVersion(m)){
                right = m;
            }else{
                left = m+1;
            }
        }
        return (int)left;
    }
}