package figury;

import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj bokA prostokatu ");
		bokA = input.nextInt();
		
		Prostokat stefan = new Prostokat(4, 8);
		stefan.pole();
		
		Trojkat gloria = new Trojkat(8, 4);
		gloria.pole();
		
		Kolo bialkov = new Kolo(5);
		bialkov.pole();
				
	}

}
