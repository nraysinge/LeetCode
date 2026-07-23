package u.poly.overrideng;

public class MainVehical {

	public static void main(String[] args) {
		Bicycle b=new Bicycle();
		b.speedUp();
		
		Car c=new Car();
		c.speedUp();
		
		Vehicle v=new Vehicle();
		v.speedUp();
	}
}
