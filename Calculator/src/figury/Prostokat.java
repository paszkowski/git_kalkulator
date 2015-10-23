package figury;

public class Prostokat extends obliczenia {

	private int bokA;
	private int bokB;
	
	Prostokat(int bokA, int bokB) {
		this.bokA = bokA;
		this.bokB = bokB;
	}
	
	
	@Override
	public void pole() {
		// TODO Auto-generated method stub
		System.out.println("kek xD");
		double pole = bokA * bokB;
		System.out.println("Pole prostokata wynosi: " + pole);
		
	}


	public int getBokA() {
		return bokA;
	}


	public void setBokA(int bokA) {
		this.bokA = bokA;
	}


	public int getBokB() {
		return bokB;
	}


	public void setBokB(int bokB) {
		this.bokB = bokB;
	}
	
	

}
