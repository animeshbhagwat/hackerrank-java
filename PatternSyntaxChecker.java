import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String REGEX = in.nextLine();
          	//Write your code
            try{
            Pattern pattern = Pattern.compile(REGEX);
            System.out.println("Valid");
            }
            catch (Exception e){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}



