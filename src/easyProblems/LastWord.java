package easyProblems;

public class LastWord {
	public int lengthOfLastWord(String s) {
		int length = 0;
		if (s.length()== 1 && s.contains(" "))
			return 0;
		if (s.length() == 1)
			return 1;
		String[] Splitter = s.split(" ");
		for(int i=0;i<Splitter.length;i++) {
			Splitter[i].trim();
		}
		int index = (Splitter.length);
		length = Splitter[index - 1].length();
		return length;
	}

	public static void main(String args[]) {
		String s = "b   a    ";
		LastWord l = new LastWord();
		System.out.println(l.lengthOfLastWord(s));
	}
}
