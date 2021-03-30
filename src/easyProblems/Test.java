package easyProblems;

public class Test {
static int counter=0;
	Test() {
		counter++;
		System.out.println(counter);
	}
public static void main(String args[]) {
	Test t1= new Test();
	Test t2= new Test();
	Test t3= new Test();
}
}
