package ProjekatPastaBar;

import java.util.Scanner;

public class pastabar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String[] stalneMusterije = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		String[] sastojci = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "SLanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		int[] cene = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		
		System.out.println("Izvolite!! ");
		int suma = 0;
		int i = 0;
		String brojTelefona = "";
		String presekNarudzbine = "Poruci";
		String nazivSastojka = "";
		while (!nazivSastojka.equals(presekNarudzbine)) {
			System.out.println("Izaberite sastojak za pastu: ");
			nazivSastojka = s.nextLine();
			suma = vracanjeSastojaka(sastojci, nazivSastojka) + suma;
		}
		System.out.println("Unesite  broj telefona: ");
		brojTelefona = s.next();
		boolean proveraStalne = proveraStalne(stalneMusterije, brojTelefona);
		if (proveraStalne) {
			suma = (int) (suma - (suma * 0.1));
			System.out.println( "Ostvarili ste popust od 10% i Vas racun iznosi " + suma + " din.");
			System.out.print("Prijatno i dodjite nam ponovo!");
		} else {
			System.out.println("Vas racun je " + suma + " dinara.");
			System.out.print("Prijatno!");
		}
	}

	public static int vracanjeSastojaka(String[] sastojci, String nazivSastojka) {
		int[] cene = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		for (int i = 0; i < sastojci.length; i++) {
			if (sastojci[i].equals(nazivSastojka)) {
				return cene[i];
			}
		}
		return 0;
	}

	public static boolean proveraStalne(String[] stalneMusterije, String brojTelefona) {
		for (int i = 0; i < stalneMusterije.length; i++) {
			if (stalneMusterije[i].equals(brojTelefona)) {
				System.out.println(i);
				return true;
			}
		}
		return false;

	}

}