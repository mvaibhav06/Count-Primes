import java.util.ArrayList;
import java.util.List;

public class CountPrimes {

    public static boolean isPrime(int n){
        if(n==2) return true;
        if (n==1 || n%2==0) return false;
        for (int i=2; i<=n/2; i++){
            if (n%i == 0) return false;
        }
        return true;
    }

    public static int countPrimes(int n){
        int counter = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i=2; i<n; i++){
            if (isPrime(i)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
