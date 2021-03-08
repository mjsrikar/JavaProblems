package easyProblems;

public class ReverseInt {
public int reverse1(int x) {
	int reversed1=0;
	
	while(x!=0) {
		int pop= x%10;
		x=x/10;
		if(reversed1>Integer.MAX_VALUE/10||reversed1==Integer.MAX_VALUE/10&& pop>7) return 0;
		if(reversed1<Integer.MIN_VALUE/10||reversed1==Integer.MIN_VALUE/10&& pop<-8) return 0;
		reversed1=(reversed1*10)+pop;
	}
	return reversed1;	
}
public static void main(String[] args) {
 int x=-123;
 ReverseInt n1= new ReverseInt();
 System.out.println(n1.reverse1(x));
}
}

