package easyProblems;

public class PlusOne {
	 public int[] plusOne(int[] digits) {
	   int n=digits.length;
	   for( int i=n-1;i>=0;i--) {
		   if(digits[i]<9) {
			   digits[i]++;
			   return digits;
		   }digits[i]=0;
	   }
          int[] newnum= new int[n+1]; 
          newnum[0]=1;
          return newnum;
	   
	 }
	 public static void main(String args[]) {
		 int[] digits= {9};
		 System.out.println(digits.length);
		 PlusOne p= new PlusOne();
		 p.plusOne(digits);
		 for(int i=0;i<digits.length;i++) {
			 System.out.print(digits[i]);
		 }
	 }
}
