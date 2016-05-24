
public class Fabin {
	

	public static void main(String[] args) {
		long startf1 = System.nanoTime();
		f1(40);
		long endf1 = System.nanoTime();
		System.out.println(endf1-startf1);
		long startf2 = System.nanoTime();
		f2(40);
		long endf2 = System.nanoTime();
		System.out.println(endf2 -startf2);
		
		
	}
	
	static long fibonaci (int n, int x ,int y) {
		if (n == 0) {
			return x;
		} 
		if (n == 1) {
			return y;
		}else {
			return fibonaci(n-1, y, x+y);
		}
	}
	
	static long f2 (int n) {
		return fibonaci(n, 0, 1);
	}
	
	static long f1 (int n) {
		if (n<=1) {
			return n;
		}else {
			return f1(n-1) + f1(n-2);
		}
	}
}
