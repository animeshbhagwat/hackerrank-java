import java.io.*;
import java.util.*;
import java.math.*;

public class biginteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BigInteger a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

