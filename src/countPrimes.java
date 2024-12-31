public class countPrimes {
    public static void main(String[] args) {
        System.out.print(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i<n; i++){
            if(i == 2 || i==3){
                count++;
            }
            else if( i%2!=0 && i%3!=0){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}
