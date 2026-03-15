package mk.strings;

public class TwoPointerAppro_Mar9 {

	public static void main(String[] args) {
		TwoPointerAppro_Mar9 str = new TwoPointerAppro_Mar9();
		
		String res = str.mergeAlternately("Mayur", "Koli");
		System.out.println(res);
	}
	   public String mergeAlternately(String word1, String word2) {
	        String result="";
	        int i=0;
	        while(i<word1.length() || i<word2.length()){
	               if(i<word1.length()){
	                    result += word1.charAt(i);
	                }
	                if(i<word2.length()){
	                    result += word2.charAt(i);
	                }
	                i++;
	        }
	        return result;
	    }
}
