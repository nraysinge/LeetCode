package d.code.quetion_17nov;

public class c_que_control_st {
		
	public static void main(String[] args) {
		
		for(int a=400; a<=550; a++) {
			
			if(a%4==0 || a%7==0) {
				
				continue;
			}
			System.out.println(a);
		}
	}
}
