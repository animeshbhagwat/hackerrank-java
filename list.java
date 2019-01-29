import java.io.*;
import java.util.*;

public class list {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> al=new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            al.add(sc.nextInt());
        } 
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            String s=sc.next();
            if(s.equals("Insert")) {
                int p1=sc.nextInt();
                int p2=sc.nextInt();
                al.add(p1, p2);
            }
            else if (s.equals("Delete")){
                int p1=sc.nextInt();
                al.remove(p1);
            }

        }
        for(int i=0;i<al.size();i++) {
            System.out.print(al.get(i)+" ");
        }
    }
}

