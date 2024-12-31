import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/description/
public class shuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] ans = shuffle(arr, 3);
        System.out.print(ans.length);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n){
        int[] result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];    // even values
            result[2 * i + 1] = nums[n + i];    //odd values
        }
        return result;

    }
}
