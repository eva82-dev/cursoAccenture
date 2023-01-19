package ejercicio2;

public class Cash {
	/**
	 * Cash
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
	
	int number=5;
	
	char a=(char)number;
	System.out.println(a);
	
	float b= number;
	System.out.println(b);

	double c= number;
	System.out.println(c);

	short d= (short)number;
	System.out.println(d);

	byte e= (byte)number;
	System.out.println(e);

	
	//se pierden datos en char,short y byte y son explícitos
	//implícitos float y double
	
	}
}
