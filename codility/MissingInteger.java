import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        int standard = 1;
        for(int i=0; i<A.length; i++){
            int element = A[i];
            if(element > 0) {
                if(standard == element){
                    standard++;
                } else if(standard > element){
                    continue;
                }
                else {
                    break;
                }
            }
        }
        return standard;
    }
}

public class MissingInteger {
    public static void main(String[] args){
        int result1 = new Solution().solution(new int[]{1,3,4,5});
        System.err.println(result1);
        int result2 = new Solution().solution(new int[]{-1,2,3,-4,0});
        System.err.println(result2);
    }
}
