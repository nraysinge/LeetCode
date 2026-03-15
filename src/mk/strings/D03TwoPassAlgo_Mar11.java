package mk.strings;

import java.util.ArrayList;
import java.util.List;

public class D03TwoPassAlgo_Mar11 {
	
	public static void main(String[] args) {
		D03TwoPassAlgo_Mar11 obj = new D03TwoPassAlgo_Mar11();
		
		int[] candies = {2,3,6,5,2,2};
		int extraCandies = 3 ;
		
		List<Boolean> list = obj.kidsWithCandies(candies, extraCandies);
		System.out.println(list);
		
		
	}

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max=candies[i];
			}
			
		}
		for(int i = 0; i<candies.length; i++) {
			if(candies[i]+extraCandies>=max) {
				list.add(true);
			}
			else {
				list.add(false);
			}
		}
		return list;
	}
}
