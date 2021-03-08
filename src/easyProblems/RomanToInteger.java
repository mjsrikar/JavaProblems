package easyProblems;

import java.util.HashMap;

public class RomanToInteger {
public int rom(String x) {
	int sum=0;
	   HashMap<Character,Integer> HM= new HashMap<>();
       HM.put('I',1);
       HM.put('V',5);
       HM.put('X',10);
       HM.put('L',50);
       HM.put('C',100);
       HM.put('D',500);
       HM.put('M',1000);
 
       for(int i=0;i<x.length();i++) {
    	   if( x.charAt(i)=='X' || x.charAt(i)=='V') {
    		   if(i>0 && x.charAt(i-1)=='I') sum=sum-2;}
    		   if( x.charAt(i)=='L' || x.charAt(i)=='C') {
        		   if(i>0 && x.charAt(i-1)=='X')  sum=sum-20;
    	   }
    		   if( x.charAt(i)=='D' || x.charAt(i)=='M') {
        		   if(i>0 && x.charAt(i-1)=='C') sum=sum-200;
       }
    		   sum=sum+HM.get(x.charAt(i));
    		   }
return sum;
}

       public static void main(String args[]) {
		   String a="III";
		   RomanToInteger x= new RomanToInteger();
		   System.out.println(x.rom(a));
	   }}

