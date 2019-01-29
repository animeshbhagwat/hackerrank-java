import java.util.*;

class map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String,Long> map = new HashMap<String,Long>();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            long l = sc.nextLong();
            map.put(s, l);
            sc.nextLine();
        }
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            try {
                long l = map.get(s);
                System.out.println(s+"="+l);
            }
            catch(Exception e) {
                System.out.println("Not found");
            }
        }
    }           
}

