import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(check(A));

    }
    public static String check(String s){
        int n = s.length();
        char[] array = s.toCharArray();
        for(int i = 0; i<array.length/2; i++){
            if(array[i] == array[n-i-1]){
                continue;
            }
            else{
                return "No";
            }
        }

        return "Yes";
    }
}
