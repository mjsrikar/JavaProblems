package easyProblems;

public class ValidPalindrome {
      public boolean isPalindrome(String s) {
    	
       String newstring="";
       for(int i=0;i<s.length();i++) {
    	   if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))) {
    		   newstring+=s.charAt(i);
    	   }
       }
       System.out.println(newstring);
       newstring=newstring.toLowerCase();
       System.out.println(newstring);
       for(int i=0;i<newstring.length()/2;i++) {
    	   if(newstring.charAt(i)!=newstring.charAt(newstring.length()-1-i)) {
    		   return false;
    	   }
      } return true;
}
      public static void main(String args[]) {
    	  String name="race a car";
    	  ValidPalindrome v= new ValidPalindrome();
    	  System.out.println(v.isPalindrome(name));
      }
}