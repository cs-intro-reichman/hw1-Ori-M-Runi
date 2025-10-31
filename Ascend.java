// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// Replace this comment with your code
		int randLimit = Integer.parseInt(args[0]);
		// Math.random() generates between [0,1), so we multiply it by the inputed limit to recive a random number between [0,Lim)
		int a = (int) (Math.random() * (randLimit));
		int b = (int) (Math.random() * (randLimit));
		int c = (int) (Math.random() * (randLimit));
		System.out.printf("%d, %d, %d%n", a, b, c);

		int abMin = Math.min(a, b);
		int abcMin = Math.min(abMin, c);

		int abMax = Math.max(a, b);
		int abcMax = Math.max(abMax, c);

		// Finding the middle value by finding the minimum of each pairing (ab, ac, bc), 
		// and finding the max out of those
		int acMin = Math.min(a, c);
		int bcMin = Math.min(b, c);
		int abcMid = Math.max(Math.max(abMin, acMin), bcMin);
		System.out.printf("%d, %d, %d%n", abcMin, abcMid, abcMax);
	}
}
