package studio7;

public class Complex {
	private double real;
	private double i;
	
	public Complex(double initReal, double initI) {
		real = initReal;
		i = initI;
	}
	public double getReal() {
		return real;
	}
	public double getI() {
		return i;
	}
	public String addComplex(Complex x) {
		double newReal = this.getReal() + x.getReal();
		double newI = this.getI() + x.getI(); 
		return newReal + " + " + newI + "i";
	}
	public static void main(String[] args){
		Complex a = new Complex (1, 2);
		Complex b = new Complex (2, 3);
		System.out.println(a.addComplex(b));
	}
	
}
