package sowardTowardOffer;

public class FibonacciDemo {
	/***
	 * recursion
	 * 
	 * @param n
	 * @return
	 */
	public int FibonacciRecursion(int n) {
		if (n == 0)
			return 0;
		if (n < 3)
			return 1;
		return FibonacciRecursion(n - 1) + FibonacciRecursion(n - 2);
	}
	/**
	 * unrecursion n >3 时需要计算 n - 2 次；
	 * @param n
	 * @return
	 */
	public int FibonacciUnRecursion(int n) {
		if (n == 0) return 0; 
		if(n <3 ) return 1;
		int a = 1;
		int b = 1;
		for (int i = 0; i < n - 2 ; i++) {
			int  temp = a + b;
			a = b ;
			 b = temp;
		}
		return b;
	}

}
