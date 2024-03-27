package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator) {
		numerator = initNumerator;
		denominator = initDenominator;
	}
	public int getDenominator() {
		return denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public String addFraction(Fraction x) {
		if(this.getDenominator() == x.getDenominator()) {
			int newNumerator = this.getNumerator() + x.getNumerator();
			return (newNumerator) + "/" + (denominator);
		}
		else {
			int newDenominator = this.getDenominator()*x.getDenominator();
			int newNum1 = this.getNumerator()*x.getDenominator();
			int newNum2 = x.getNumerator()*this.getDenominator();
			int finalNumerator = newNum1 + newNum2;
			return (finalNumerator) + "/" + (newDenominator);
		}
	}
	public String multiplyFraction(Fraction x) {
		int newNumerator = this.getNumerator()*x.getNumerator();
		int newDenominator = this.getDenominator()*x.getDenominator();
		return (newNumerator) + "/" + (newDenominator);
	}
	public String getReciprocal() {
		int newNumerator = this.getDenominator();
		int newDenominator = this.getNumerator();
		return (newNumerator) + "/" + (newDenominator);
	}
	public String simplify() {
		int newNumerator = this.getNumerator()/this.gcf(this.getNumerator(), this.getDenominator());
		int newDenominator = this.getDenominator()/this.gcf(this.getNumerator(), this.getDenominator());
		return (newNumerator) + "/" + (newDenominator);
	}
	
	private int gcf(int numerator, int denominator) {
		if(denominator !=0) {
			return gcf(denominator, numerator%denominator);
		}
		else return numerator; 
		
	}
	
	// 6/2  --> divide by denominator
	// 2/6  --> divide by numerator
	// 24/32 --> divide by 8 
	
	public static void main(String[] args){
		Fraction a = new Fraction(32,24);
		Fraction b = new Fraction(1,3);
		System.out.println("sum is: " + a.addFraction(b));
		System.out.println("product is: " + a.multiplyFraction(b));
		System.out.println("reciprocal is: " + a.getReciprocal());
		System.out.println("simplified is: " + a.simplify());
	}
}
