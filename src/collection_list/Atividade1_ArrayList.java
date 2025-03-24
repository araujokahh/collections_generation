package collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1_ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("Digite 5 cores: ");
		cores.add(sc.nextLine());
		cores.add(sc.nextLine());
		cores.add(sc.nextLine());
		cores.add(sc.nextLine());
		cores.add(sc.nextLine());

		System.out.println("\nListar todas as cores: \n");
		for(String coresInseridas : cores) {
			System.out.println(coresInseridas);
		}
		
		System.out.println("\nOrdenar as cores: \n");
		cores.sort(null);
		
		for(String coresInseridas : cores) {
			System.out.println(coresInseridas);
		}
		
		
		

	
		
		
		sc.close();
	}

}
