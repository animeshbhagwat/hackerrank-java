import java.io.*;
import java.util.*;

public class split {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        if (s.length()>400000)
         return;
        if(s.trim().equals("")) {
            System.out.println("0");
            return;
        }
        String str [] = s.trim().split("[' '!,?._'@]+");
        System.out.println(str.length);
        for(int i=0;i<str.length;i++)
            System.out.println(str[i]);
    }
}

