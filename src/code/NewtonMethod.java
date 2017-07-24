package code;

public class NewtonMethod {
		
	public static double sqr(double n){
		
		double x = 1.0;
		while((Math.abs(x*x-2))> 1e-9){
			x = (x + n / x)/2;
		}	
		return x;
	}
	public static void main(String[] args) {
	
		System.out.println(NewtonMethod.sqr(2));
	
  }
}
