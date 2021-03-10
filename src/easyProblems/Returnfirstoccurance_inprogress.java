package easyProblems;

public class Returnfirstoccurance_inprogress {
	  public int strStr(String haystack, String needle) {
	     int index=0;
	     if(haystack==null || needle== null || haystack.length()==0|| needle.length()==0) return 0;
	     if(haystack.contains(needle)) {
	    for(int i=0;i<haystack.length();i++) {
	    if(haystack.charAt(i)==needle.charAt(0)) {
	    	index=i-1;
	    }
	    }
	    }
	     else return -1;
	    return index;
	    }
	  public static void main(String args[]) {
		 String haystack = "hello";
		  String needle = "ll";
		  Returnfirstoccurance_inprogress r1= new Returnfirstoccurance_inprogress();
		  System.out.println(r1.strStr(haystack, needle));
	  }
}
