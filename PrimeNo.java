
public class PrimeNo {

    public static boolean isPrime(int number){
       
        boolean isPrime = true;
        for(int i = 2; i <= number-1; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }       
        return isPrime;
    }


    public static void main(String[] args) {

        System.out.println(isPrime(5));    

    }

}