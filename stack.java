import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
        Scanner sc = new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<Character>();
		while (sc.hasNext()) {
			String input=sc.next();
            
            // if(input.length()==0) {
            //   System.out.println("true");
            //   continue;  
            // }
            
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                switch(ch) {
                    case '(':
                    case '{':
                    case '[': stack.push(ch);
                    break;

                    case ')':
                    case '}':
                    case ']': if(stack.isEmpty()) {
                        // System.out.println("false");
                        break;
                    } else { 
                        char p = stack.pop();
                        if () 
                    }
                    break;

                }
            }
            if (stack.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

		}

	}
}