package test;

public class SolutionPowerOfTwo {

	public static void main(String[] args) {
		SolutionPowerOfTwo solutionPowerOfTwo = new SolutionPowerOfTwo();
		boolean power = solutionPowerOfTwo.isPowerOfTwo(44000000);
		if (power) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public boolean isPowerOfTwo(int n) {
		if (n == 1) return true;
		        
		        for (;;) {
		            if (n%2 == 1) return false;
		            if (n == 2) return true;
		            n = n/2;
		        }
    }
    
    private int devide (int n) {
        if (n%2 == 1) {
            return 1;
        }else if (n == 2) {
            return 2;
        }else {
            return devide (n/2);
        }
    }
}
