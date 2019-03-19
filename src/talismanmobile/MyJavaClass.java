package talismanmobile;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MyJavaClass {
	// base fibonacci values
	static int fib1 = 0;
	static int fib2 = 1;
	
	public static void main (String []args) {
		
		//horizontal values
		for (int x =0; x<8; x++) {
			//vertical values
			for(int y = 0; y < 8; y++) {
				//if white one
				if ((x + y) % 2 == 0 ) {
					System.out.print(findFib() + "\t");
				}
				// if black one
				else {
					System.out.print(findPower(x,y) + "\t");
				}
			}
			//end of a horizontal line
			System.out.println();
		}
	}
	
	//calculation of a fibonacci value
	public static int findFib() {
		int total = fib1 + fib2;
		fib1 = fib2;
		fib2 = total;
		return total;
	}
	//calculation of power and its length
	public static int findPower(int x, int y ) {
		NumberFormat formatter = new DecimalFormat("#");
		double amount = (Math.pow(2, ((x*8+y+1)+1)/2));
		return formatter.format(amount).length();
	}
}
