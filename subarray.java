import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int c=0,sum=0;
        int n = scan.nextInt();
        int arr[] = new int [n];

        for(int i=0; i<n; i++) {
            arr[i]=scan.nextInt();
        }
        //for(int turn=0; turn<n; turn++) {
            for(int j=0; j<n; j++) {
                for(int i=0; i<n-j; i++) {
                    sum=0;
                    for(int k=i; k<=i+j; k++) {
                        sum+=arr[k];
                        }
                    if(sum<0) {
                        c++;
                    }
                }
            }
        //}
        System.out.println(c);
    }
}

