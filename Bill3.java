// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		// Input variables are assumed to be 3 Strings representing names and 1 integer representing the bill's cost
		String name2 = args[1], name3 = args[2];
		int billAmount = Integer.parseInt(args[3]);

		double amountToPay = Math.ceil(billAmount / 3.0);
		System.out.printf("Dear %s, %s and %s: pay %.1f Shekels each.%n", name3, name2, name1, amountToPay);
	}
}
