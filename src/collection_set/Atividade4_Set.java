package collection_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4_Set {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> valoresSet = new HashSet<Integer>();

		valoresSet.add(2);
		valoresSet.add(5);
		valoresSet.add(1);
		valoresSet.add(3);
		valoresSet.add(4);
		valoresSet.add(9);
		valoresSet.add(7);
		valoresSet.add(8);
		valoresSet.add(10);
		valoresSet.add(6);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		int encontrarValor = sc.nextInt();

		if (valoresSet.contains(encontrarValor)) {
			System.out.println("\nO número " + encontrarValor + " foi encontrado!");

		} else {
			System.out.println("\nO número " + encontrarValor + " não foi encontrado!");

		}

		sc.close();
	}

}
