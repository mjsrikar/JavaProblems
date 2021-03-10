package easyProblems;

public class PlusOne {
	 public int[] plusOne(int[] digits) {
	    if(digits[digits.length-1]<=9) {
	    	digits[digits.length-1]+=1;
	    }else {
	    	digits[digits.length-1]=0;
	    	digits[digits.length-2]+=1;
	    }  
	 return digits;}
	 public static void main(String args[]) {
		 int[] digits= {4,4,4,5};
		 PlusOne p= new PlusOne();
		 p.plusOne(digits);
		 for(int i=0;i<digits.length;i++) {
			 System.out.print(digits[i]);
		 }
	 }
}
