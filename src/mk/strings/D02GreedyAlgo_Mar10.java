package mk.strings;

public class D02GreedyAlgo_Mar10 {
	public static void main(String[] args) {
		
		D02GreedyAlgo_Mar10 str = new D02GreedyAlgo_Mar10();		
		System.out.println(str.gcdOfStrings("ABCABC", "ABC")); // ABC
        System.out.println(str.gcdOfStrings("ABABAB", "ABAB")); // AB
        System.out.println(str.gcdOfStrings("LEET", "CODE"));   // ""
        System.out.println(str.gcdOfStrings("AAAAAB", "AAA"));  // ""
		
	}
	public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
            return str1.substring(0, gcdLength);
    }
        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
		
}
