import java.util.List;
import java.util.ArrayList;

public class maxCandy {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }

     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        ArrayList<Boolean> newList = new ArrayList<>();

        //find max candies
        for(int i : candies) {
            if(i > max) {
                max = i;
            }
        }

        // check if normal + extra >= max
         for (int candy : candies) {
             boolean ans = (candy + extraCandies >= max);
             newList.add(ans);
         }

        return newList;
    }

}
