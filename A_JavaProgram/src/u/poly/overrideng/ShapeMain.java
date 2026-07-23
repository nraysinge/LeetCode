package u.poly.overrideng;

public class ShapeMain {
	public static void main(String[] args) {
		
		Shape s=new Shape();
		float a=s.calculateArea();
		System.out.print(a);
		
		Circle c=new Circle();
		double n=c.CalculateArea();
		System.out.println("Circal Area is:- "+n);
		
		Rectangle r=new Rectangle();
		double e=r.CalculateArea();
		System.out.println("Rectabgle Area is:- "+e);
		
		Triangle t=new Triangle();
		double p=t.calculateArea();
		System.out.println("Tringle Area is:- "+p);
	}
}