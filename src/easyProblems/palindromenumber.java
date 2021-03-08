package easyProblems;

public class palindromenumber {
	public boolean palin(int x) {
		/*
		 * int temp=x; boolean flag=false; int reversed=0; if(x<0) return flag; //else
		 * if(x==0) flag= true; else { while (x>reversed) { int pop=x%10; x=x/10;
		 * reversed=(reversed*10)+pop;
		 * 
		 * } } //System.out.println(reversed); if(x==reversed || x==reversed/10)
		 * flag=true; return flag;
		 */
		int reverse_int = 0;
		
		if (x == 0) {
			return true;
		}
		else if (x < 0 || x % 10 == 0) {
			return false;
		}
		while (x > reverse_int) {
			int pop = x % 10;
			x = x / 10;
			reverse_int = (reverse_int * 10) + pop;
		}
		if (reverse_int == x || x == reverse_int / 10) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int x = 0;
		palindromenumber p1 = new palindromenumber();
		System.out.println(p1.palin(x));
	}
}
