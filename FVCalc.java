// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentValue = Integer.parseInt(args[0]);
		double intrestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		int futureValue = (int) (currentValue * Math.pow(intrestRate / 100 + 1, years));
		System.out.printf("After %1$d years, $%2$,d saved at %3$.1f%% will yield $%4$,d%n", 
						  years, currentValue, intrestRate, futureValue);

	}
}