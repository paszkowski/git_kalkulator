package figury;

public class Trojkat extends obliczenia {
	
	private int wysokosc;
	private int podstawa;
	
	Trojkat(int wysokosc, int podstawa) {
		this.setWysokosc(wysokosc);
		this.setPodstawa(podstawa);
	}
	
	
	@Override
	public void pole() {
		// TODO Auto-generated method stub
		double pole = (getWysokosc() * getPodstawa()) * 0.5;
		System.out.println("Pole trojkata wynosi " + pole);
		
	}


	public int getWysokosc() {
		return wysokosc;
	}


	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
	}


	public int getPodstawa() {
		return podstawa;
	}


	public void setPodstawa(int podstawa) {
		this.podstawa = podstawa;
	}

}
