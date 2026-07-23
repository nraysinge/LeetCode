package q.array.practical.hw_8Dec;

public class BikeMain {

	public static void main(String[] args) {
//		Bike b=new Bike();
//		b.showData();
//		
//		Bike b2=new Bike("Honda","Passion Pro","110 CC","4 Giars",110000);
//		
//		Bike b3=new Bike();
//		
//		b3.acceptBikeData();
//		b3.showData();
		
		Bike.bikeAcceptArray();
		System.out.println();
		System.out.println("-------");
		System.out.println();
		Bike.bikeShowArray();
		Bike.bikeSortPrise();
		Bike.bikeShowArray();
	}
}
