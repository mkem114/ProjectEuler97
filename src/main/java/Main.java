import java.math.BigInteger;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;
import static java.math.BigInteger.valueOf;

public class Main {
    public static void main(String[] args) {
        final BigInteger bigPrime = TWO.pow(7830457).multiply(valueOf(28433)).add(ONE);
        final String bigPrimeString = bigPrime.toString();
        System.out.println(bigPrimeString.substring(bigPrimeString.length() - 10));
    }
}
