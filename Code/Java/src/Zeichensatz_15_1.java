
public class Zeichensatz_15_1 {
	public static void main(String[] args) {
		// ToDo: Select Random Number between a and b, then display it itself, hexadezimal and binary
		
		int a = 65;
		int b = 76;
		//X ist Zahl zum Einfuegen
	while (a <= b) {
	System.out.print("x:" + a + "  ");
	System.out.print("ASCII:" + (char)a	+ "  ");
	System.out.print("Hexadezimal:" + Integer.toHexString(a) + "  ");
	System.out.print("Binary:" + Integer.toBinaryString(a) + "  ");
	System.out.println();
	a++;
		}
	}
}