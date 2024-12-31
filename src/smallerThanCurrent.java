//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

import java.util.Arrays;

public class smallerThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] finalArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(j!=i && nums[j] < nums[i]){
                    count++;
                }
            }
            finalArr[i] = count;
        }
        return finalArr;
    }
}
