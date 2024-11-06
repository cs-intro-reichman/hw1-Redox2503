// Computes the future value of a saving investment.

public class FVCalc {
	public static void main(String[] args){
		int currentVaule = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]); // n represents the number of years.
		
		double futureValue =  currentVaule * Math.pow(1 + (double)rate / 100, n);
		System.out.println("After " + n + " years, a $" + currentVaule +
			" saved at " + (double)rate + " will yield " + '$' + (int)futureValue);
	}
}