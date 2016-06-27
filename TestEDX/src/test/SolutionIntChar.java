package test;

public class SolutionIntChar {

	public static void main(String[] args) {
		int i = -10;
		char a = (char)i;
		System.out.println(a + "int" + (int)a);
		
	}
	
	@SuppressWarnings("unused")
	private static void printByteToDouble() {
		for (byte i = -127; i<127;i++) {
			System.out.println(i+"\t"+(double)i);
		}
	}
	
	@SuppressWarnings("unused")
	private static void printDoubleToByte() {
		for (double i = -32768.1 ; i<32767;i++) {
			System.out.println(i+"\t"+(byte)i);
		}
	}
	
	
	@SuppressWarnings("unused")
	private static void printIntToChar() {
		for (int i = 0; i<256;i++) {
			System.out.println(i+"\t"+(char)i);
		}		
	}
	
	@SuppressWarnings("unused")
	private static void printByteToChar() {
		for (int  i = 0;  i < 256;i++) {
			byte b = (byte)i;
			System.out.println(i+"\t"+(char)b);
		}
	}
	
	@SuppressWarnings("unused")
	private static void printIntToByte() {
		for (int i = 0; i<256; i++) {
			System.out.println(i+"\t"+(byte)i);
		}
	}
	
	@SuppressWarnings("unused")
	private static void printByteToInt() {
		for (byte i = -127; i<127; i++) {
			System.out.println(i+"\t"+(int)i);
		}
	}
	
	@SuppressWarnings("unused")
	private static void printShortToChar() {
		for (int i = 0; i< 65535;i++) {
			System.out.println(i+"\t"+(char)i);
		}	
	}
	
	@SuppressWarnings("unused")
	private static void printDoubleToChar() {
		double d = 1000.555;
		int a = (int)d;
		System.out.println((char)a+"\t"+(char)d);
	}
	
	@SuppressWarnings("unused")
	private static void printChartToDouble() {
		char a = 1000;
		System.out.println(a+"\t"+ (double)a);
	}
}
