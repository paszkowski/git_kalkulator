package figury;

import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pola do wyboru: ");
		System.out.println("1 policz pole prostokatu");
		System.out.println("2 policz pole trojkata");
		System.out.println("3 policz pole kola");
		System.out.println(" ");
		
		boolean kek = false;
		int x = input.nextInt();
		
		switch(x) {
		
		case 1:
		System.out.println("Podaj bokA i bokB");
		int A = input.nextInt();
		int B = input.nextInt();
		
		Prostokat stefan = new Prostokat(A, B);
		stefan.pole();
		break;
		
		case 2:
			System.out.println("Podaj podstawe i wysokosc");
			int C = input.nextInt();
			int D = input.nextInt();
		Trojkat gloria = new Trojkat(C, D);
		gloria.pole();
		break;
		
		
		case 3:
			System.out.println("Podaj promien");
			int E = input.nextInt();
		Kolo bialkov = new Kolo(E);
		bialkov.pole();
		break;
		
		
		default: System.out.println("Nie wybrano sensownej kategorii");
		
		}		
	}

}
