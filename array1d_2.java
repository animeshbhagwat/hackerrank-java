import java.util.*;

public class array1d_2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int pos=0,n=game.length;
        boolean flag = false;
        int count = 999;
        while (count>0) {
            if(pos + leap >= n || pos==n) {
                flag = true;
                return true;
            }
            if(game[pos+leap]==0) {
                pos+=leap;
                count--;
                continue;
            }
            if(game[pos+1]==0) {
                pos++;
                count--;
                continue;
            }
            if(game[pos-1]==0) {    
                pos--;
                count--;
                continue;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

