package mk.strings;

public class D07IncreasingTripletSubsequence {

	public static void main(String[] args) {
		
		D07IncreasingTripletSubsequence in = new D07IncreasingTripletSubsequence();
		int[] arr= {2,1,0,4,2};
		boolean jj=in.increasingTriplet(arr);
		
		System.out.println(jj);
	}
	 public boolean increasingTriplet(int[] nums) {
	        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
	        for (int n : nums) {
	            if (n <= small) { small = n; } 
	            else if (n <= big) { big = n; } 
	            else return true; 
	        }
	        return false;
	    }
}
