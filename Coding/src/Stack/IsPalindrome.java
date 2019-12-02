package Stack;

import java.util.Stack;

public class IsPalindrome {
	
	public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
       
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        
        // should return false
        System.out.println(checkForPalindrome("hello"));
        
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	
    	Stack stack = new Stack();
    	Stack stack2 = new Stack();
    	string = string.replaceAll("[^a-zA-Z]+", "").toLowerCase();
    	for(int i = 0 ; i < string.length() ; i++)
    		stack.push(string.charAt(i));
    	
    	for(int i = 0 ; i < stack.size() ; i++) {
    		char c = (char) stack.pop();
    		if(stack.size() != stack2.size())
    			stack2.push(c);
    	}
//    	System.out.println(stack);
//    	System.out.println(stack2);
    	
    	while(!stack.isEmpty()) {
    		if (stack.pop() != stack2.pop())
    			return false;
    	}
        return true;
    }
}
