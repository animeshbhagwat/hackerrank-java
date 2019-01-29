import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,pos1,pos2,l,ele;
        ArrayList<Integer> al [] = new ArrayList[n];
        for(i=0;i<n;i++) {
            l = sc.nextInt();
            al[i] = new ArrayList<Integer>();
            for(j=0;j<l;j++) {
                ele = sc.nextInt();
                al[i].add(ele);
            } 
        }
        n = sc.nextInt();
        for(i =0; i<n;i++) {
            pos1 = sc.nextInt();
            pos2 = sc.nextInt();
            try {
                System.out.println(al[pos1-1].get(pos2-1));
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }
}

