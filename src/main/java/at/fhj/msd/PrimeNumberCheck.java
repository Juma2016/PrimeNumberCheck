package at.fhj.msd;

public class PrimeNumberCheck {

    public static String checkNumber(int num){
        if(num<2)
            return "Not Prime";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "Not Prime";  // If divisible, it's not prime
            }
        }    
        return  "Prime";
    }
}