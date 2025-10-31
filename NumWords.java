// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int inputNum = Integer.parseInt(args[0]);

		int numHundreds = inputNum / 100;
		int numTens = (inputNum % 100) / 10;
		int numOnes = inputNum % 10;
		System.out.printf("%d hundreds, %d tens, %d ones.%n", numHundreds, numTens, numOnes);
	}
}
