package figury;

public class Kolo extends obliczenia {
	
	private int promien;
	public final static double PI  = 3.14;
	
	Kolo(int promien) {
		this.promien = promien;
	}
	
	
	public int getPromien() {
		return promien;
	}
	
	
	public void setPromien(int promien) {
		this.promien = promien;
	}


	@Override
	public void pole() {
		// TODO Auto-generated method stub
		double poleKola = getPromien() * getPromien() * PI;
		System.out.println("Pole wynosi " + poleKola);
		
	}

}
