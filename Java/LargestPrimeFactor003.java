import java.lang.Math;

class LargestPrimeFactor003 {
    public static void main(String[] args) {
        primeFactorization(13195);
    }
    
    public static void primeFactorization(int n){
        int counter = 0;
        String output = "";
        for ( int j = 2; j < Math.sqrt(n); j++) {
             
            if (n % j == 0) {
                counter = 0;
                while ( n % j == 0) {
                    n = n / j;
                    counter++;
                }
                output = String.format("%d ^ %d",j, counter);
                System.out.println(output);
            } 
        }
        if (n != 1){
            output = String.format("%d ^ %d",n ,1);
            System.out.println(output);
        }
    }