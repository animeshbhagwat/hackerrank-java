import java.io.*;
import java.util.*;

public class bitset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            BitSet b1 = new BitSet(n);
            BitSet b2 = new BitSet(n);
            int i,j,p;
            for (int c= 0; c < m; c++) {
                String s = sc.next();
                switch (s) {
                    case "AND":
                    i = sc.nextInt();
                    j = sc.nextInt();
                    if(i==1 && j==2){
                        b1.and(b2);
                    } else if(i==2 && j==1) {
                        b2.and(b1);
                    }
                        break;

                    case "OR" :
                    i = sc.nextInt();
                    j = sc.nextInt();
                    if(i==1 && j==2){
                        b1.or(b2);
                    } else if(i==2 && j==1) {
                        b2.or(b1);
                    }
                    break;

                    case "XOR":
                    i = sc.nextInt();
                    j = sc.nextInt();
                    if(i==1 && j==2){
                        b1.xor(b2);;
                    } else if(i==2 && j==1) {
                        b2.xor(b1);
                    }
                    break;

                    case "FLIP" :
                    i = sc.nextInt();
                    p = sc.nextInt();
                    if(i==1) {
                        b1.flip(p);
                    } else if (i==2) {
                        b2.flip(p);
                    }
                    break;

                    case "SET":
                    i = sc.nextInt();
                    p = sc.nextInt();
                    if(i==1) {
                        b1.set(p);
                    } else if (i==2) {
                        b2.set(p);
                    }
                    break;

                    default: 
                    System.out.println("input error");
                    return;
                };
                System.out.println(b1.cardinality()+" "+b2.cardinality());
            }
    }
}

