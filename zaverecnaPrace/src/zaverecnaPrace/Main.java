package zaverecnaPrace;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		Hrac hráè = new Hrac("Hráè", 10, 2, 20, false);
		
		//zadání vlastností místností
		ArrayList<mistnost> vlastnostMistnosti = new ArrayList<>();
		vlastnostMistnosti.add(new mistnost("A1", false, false, false));
		vlastnostMistnosti.add(new mistnost("A2", false, false, false));
		vlastnostMistnosti.add(new mistnost("A3", false, false, false));
		vlastnostMistnosti.add(new mistnost("A4", false, false, false));
		vlastnostMistnosti.add(new mistnost("A5", false, false, false));
		vlastnostMistnosti.add(new mistnost("B1", false, false, false));
		vlastnostMistnosti.add(new mistnost("B2", false, false, false));
		vlastnostMistnosti.add(new mistnost("B3", false, false, false));
		vlastnostMistnosti.add(new mistnost("B4", false, false, false));
		vlastnostMistnosti.add(new mistnost("B5", false, false, false));
		vlastnostMistnosti.add(new mistnost("C1", false, false, false));
		vlastnostMistnosti.add(new mistnost("C2", false, false, false));
		vlastnostMistnosti.add(new mistnost("C3", false, false, false));
		vlastnostMistnosti.add(new mistnost("C4", false, false, false));
		vlastnostMistnosti.add(new mistnost("C5", false, false, false));
		vlastnostMistnosti.add(new mistnost("D1", false, false, false));
		vlastnostMistnosti.add(new mistnost("D2", false, false, false));
		vlastnostMistnosti.add(new mistnost("D3", false, false, false));
		vlastnostMistnosti.add(new mistnost("D4", false, false, false));
		vlastnostMistnosti.add(new mistnost("D5", false, false, false));
		vlastnostMistnosti.add(new mistnost("E1", false, false, false));
		vlastnostMistnosti.add(new mistnost("E2", false, false, false));
		vlastnostMistnosti.add(new mistnost("E3", false, false, false));
		vlastnostMistnosti.add(new mistnost("E4", false, false, false));
		vlastnostMistnosti.add(new mistnost("E5", false, false, false));
		
		/*for (int i = 0; i < vlastnostMistnosti.size(); i++) {
			int sance = random.nextInt(25);
			if (sance == 0 || sance == 1) {
				vlastnostMistnosti.get(i).setPritomnostGadget(true);
			}
			if (sance == 2 || sance == 3 || sance == 4 || sance == 5 || sance == 6 || sance == 7 || sance == 8 || sance == 9 || sance == 10 || sance == 11 || sance == 12) {
				vlastnostMistnosti.get(i).setPritomnostEnemy(true);
			}
		}
		System.out.println(vlastnostMistnosti);
		
		//vykreslení domu
		for (int i = 0; i < vlastnostMistnosti.size(); i++) {
			
			if (vlastnostMistnosti.get(i).isPritomnostHrac() == true) {
				System.out.print("--" + " ");
			}
			if (vlastnostMistnosti.get(i).isPritomnostHrac() == false) {
				System.out.print(vlastnostMistnosti.get(i).getJmeno() + " ");
			}
			if (i == 4 || i == 9 || i == 14 || i == 19 || i == 24) {
				System.out.println();
			}
		}
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println();
		*/
		
		//hra zaèala
		while (hráè.getHp() != 0 || hráè.getHp() < 0) {
			
			int i = 0;
			for (i = 0; i < vlastnostMistnosti.size(); i++) {
			
				if (vlastnostMistnosti.get(i).isPritomnostHrac() == true) {
					System.out.print("--" + " ");
				}
				if (vlastnostMistnosti.get(i).isPritomnostHrac() == false) {
					System.out.print(vlastnostMistnosti.get(i).getJmeno() + " ");
				}
				if (i == 4 || i == 9 || i == 14 || i == 19 || i == 24) {
					System.out.println();
				}
				if (i == 24) {
					System.out.println("_______________________________________________________________________________________________________");
					System.out.println();
					System.out.println("5) nahoru 2) dolu 1) doleva 3) doprava");
				}
				
					
			}
			
			int j = 0;
			for (j = 0; j < vlastnostMistnosti.size(); j++) {
				if (vlastnostMistnosti.get(j).isPritomnostHrac() == true) {
					break;
				}
			}
					
				int pohyb = input.nextInt();
				//hráè se pohnul do leva
				if (pohyb == 1) {
					vlastnostMistnosti.get(j).setPritomnostHrac(false);
					vlastnostMistnosti.get(j - 1).setPritomnostHrac(true);
				}
				//hráè se pohnul dolù
				if (pohyb == 2) {
					vlastnostMistnosti.get(j).setPritomnostHrac(false);
					vlastnostMistnosti.get(j + 5).setPritomnostHrac(true);
				}
				//hráè se pohnul do prava
				if (pohyb == 3) {
					vlastnostMistnosti.get(j).setPritomnostHrac(false);
					vlastnostMistnosti.get(j + 1).setPritomnostHrac(true);
				}
				//hráè se pohnul nahoru
				if (pohyb == 5) {
					vlastnostMistnosti.get(j).setPritomnostHrac(false);
					vlastnostMistnosti.get(j - 5).setPritomnostHrac(true);
				}
				
				System.out.println("_______________________________________________________________________________________________________");
				System.out.println();
			
		
		}
		
	}

}
