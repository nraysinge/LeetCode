package u.tryCatch;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch t = new TryCatch();
		t.m2(12, 0);
	}

	public void m2(int a, int b) {
		try {
			System.out.println("Int a is :- " + a);
			System.out.println("Int b is :- " + b);
			int c = a / b;
			System.out.println("a / b is :- " + c);
		} catch (Exception d) {
			System.out.println(d);
		}
		finally{
			System.out.println("---------");
		}
	}
}