import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/description/
public class runningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                continue;
            }
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
