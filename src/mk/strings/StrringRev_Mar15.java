package mk.strings;

public class StrringRev_Mar15 {

	public static void main(String[] args) {

		StrringRev_Mar15 m = new StrringRev_Mar15();
		String s = m.reverseStr("Hello World");
		System.out.print(s);
		
		String s1 = m.reverseWords("Java is a programming language");
		System.out.print("\n"+s1);
	}
		
	// Word Reverse 
	public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
            String out = "";
                for (int i = str.length - 1; i > 0; i--) {
                    out += str[i] + " ";
                }
            return out + str[0];
        }
    
	// String Revers
	public String reverseStr(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}

		return temp;
	}
	
}   

