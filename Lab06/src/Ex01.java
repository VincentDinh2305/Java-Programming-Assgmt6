import java.util.*;

public class Ex01 
{
   public static String reverse(String s)
   {
	   char[] reverse = new char[s.length()];
	   Stack<Character> stack = new Stack<Character>();
	   
	   for (int i=0;i<s.length();i++) 
	   {
		   stack.push(s.charAt(i));
	   }
	   
	   int i = 0;
	   
	   while (!stack.isEmpty())
	   {
		   reverse[i++] = stack.pop();
	   }

	   return new String(reverse);
   }
   
   public static void main(String[] args) 
   {
       String s1 = "COMP228";
       String s2 = "abcdefghkLMNOP";
       System.out.printf("Reverse of '%s' ----------> '%s'%n", s1, reverse(s1));
       System.out.printf("Reverse of '%s' ----------> '%s'%n", s2, reverse(s2));
   }
}