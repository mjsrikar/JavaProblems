package easyProblems;

public class LastWord2 {
	public int lengthOfLastWord(String s) {
		int length = 0;
		if (s.length()== 1 && s.contains(" "))
			return 0;
		if (s.length() == 1)
			return 1;
		String[] Splitter = s.split(" ");
		for(int i=Splitter.length-1;i>=0;i--) {
			if(Splitter[i]!=null) {
				return Splitter[i].length();
			}
		}
		
		return length;
	}

	public static void main(String args[]) {
		String s = "b   a    ";
		LastWord l = new LastWord();
		System.out.println(l.lengthOfLastWord(s));
	}
}
