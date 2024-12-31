import java.lang.reflect.Array;
import java.util.Arrays;

public class shifting_class {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
 //       int temp = arr[0];
 //       for (int i = 0; i < arr.length-1; i++) {
 //           arr[i] = arr[i+1];
 //       }
 //       arr[arr.length-1] = temp;
        moveArray(arr, 3);
        System.out.print(Arrays.toString(arr));
    }

    static void moveArray(int[] arr, int d){
        int p = 0;
        while(p<d){
            int temp = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            p++;
        }
    }
}
