package mk.strings;

public class GreedyAlgo2_Mar12 {

	public static void main(String[] args) {
		GreedyAlgo2_Mar12 str = new GreedyAlgo2_Mar12();
		
		int flowerbed []= {1,0,0,0,1};
		int n = 5;
		boolean res = str.canPlaceFlowers(flowerbed, n);
		System.out.println(res);
		
	}
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)                    
                && (i == flowerbed.length -1 || flowerbed[i + 1] == 0)){
                    
                    flowerbed[i] = 1;
                    count++;
                }
        }
        return count >= n;
    }
}
