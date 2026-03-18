package mk.strings;

public class D06ProductofArrayExceptSelf {

	public static void main(String[] args) {
		D06ProductofArrayExceptSelf ae = new D06ProductofArrayExceptSelf();
		int[] arr = {2,3,4,1,1};
		
		int[] result = ae.productExceptSelf(arr);
		
		System.out.println(java.util.Arrays.toString(result));
	}
	
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		res[0] = 1;
		for (int i = 1; i < n; i++) {
			res[i] = res[i - 1] * nums[i - 1];
		}
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			res[i] *= right;
			right *= nums[i];
		}
		return res;
	}
}
