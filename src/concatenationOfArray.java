import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/description/
public class concatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = getConcatenation(arr);
        System.out.print(Arrays.toString(ans));

    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*(nums.length)];
        for(int i = 0; i<ans.length/2; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}


