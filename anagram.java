import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int i,j,f=1;
        if(a.length()!=b.length())
            return false;
        char ca[] = a.toLowerCase().toCharArray();
        char cb[] = b.toLowerCase().toCharArray();
        for(i=0; i<ca.length; i++) {
            for( j=0; j<cb.length; j++) {
                if(ca[i]==cb[j]) {
                   // f=0;
                    cb[j]='z';
                    break;
                }
            }
           // if (f==1)
               // return false;
        }
        for(j=0;j<cb.length;j++)
            if(cb[j]!='z')
                return false;
        return true;
        /*String sb2=cb.toString();
        for(j=0;j<sb2.length();j++)
         if(sb2.charAt(j)!='z')
            return false;
        return true;
        */
        /*
        String sa = a.toLowerCase();
        String sb = b.toLowerCase();

        for(i=0;i<sa.length();i++){
            for(j=0; j<sb.length(); j++) {
                if(sa.charAt(i)==sb.charAt(j)){
                    continue;
                }
            }
            if (j==sb.length()) 
                return false;
        }
        return true;
        */
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}