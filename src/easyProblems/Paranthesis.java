package easyProblems;

import java.util.Stack;

public class Paranthesis {
public boolean isValid(String s) {
        if(s.length()==1 || s.length()%2!=0) return false;
        if(s.length()==0) return true;
        Stack<Character> s1= new Stack<>();
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
        		s1.push(s.charAt(i));
        	}else if (s.charAt(i)==')'&&!s1.isEmpty()&&s1.peek()==('(')) {
        		s1.pop();
        	}else if (s.charAt(i)==']'&&!s1.isEmpty()&&s1.peek()==('[')) {
        		s1.pop();
        	}else if (s.charAt(i)=='}'&&!s1.isEmpty()&&s1.peek()==('{')) {
        		s1.pop();
        	}else return false;
        	System.out.println(s1);
        }return s1.isEmpty();
    }
public static void main(String args[]) {
String s="([}}])";
Paranthesis p1= new Paranthesis();
System.out.println(p1.isValid(s));
}
}
