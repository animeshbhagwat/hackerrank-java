import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class primality {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        if(n.isProbablePrime(10)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
