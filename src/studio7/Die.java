package studio7;

public class Die {
	private int sides;
	
	public Die(int initSides) {
		sides = initSides;
	}
	
	public int throwDie() {
		int n = (int)(Math.random()*(sides))+1;
		return n;
	}
	public static void main(String[] args){
		Die a = new Die(6);
		System.out.println(a.throwDie());
		
	}
}
