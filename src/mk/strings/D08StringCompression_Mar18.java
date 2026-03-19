package mk.strings;

public class D08StringCompression_Mar18 {
	
	public static void main(String[] args) {
		D08StringCompression_Mar18 sc = new D08StringCompression_Mar18();
		
		
		 char[] ch = {'a','a','b','b','c','c','c'};

		    int result = sc.compress(ch);

		    System.out.print("[");
		    for (int i = 0; i < result; i++) {
		        System.out.print("\"" + ch[i] + "\"");
		        if (i != result - 1) {
		            System.out.print(",");
		        }
		    }
		    System.out.println("]");
	}
	    public int compress(char[] chars) {
	        
	          StringBuilder str = new StringBuilder();
	        for(int i = 0; i < chars.length; ) {
	            char c = chars[i];
	            int cnt = 1;
	            while (i + 1 < chars.length && c == chars[i + 1]) {
	                i++;
	                cnt++;
	            }
	            str.append(c);
	            if (cnt > 1) {
	                str.append(cnt);
	            }
	            i++;
	        }
	        char[] comp = str.toString().toCharArray();
	        for(int i=0;i<comp.length;i++){
	            chars[i]=comp[i];
	        }
	        return comp.length;
	    }
}
