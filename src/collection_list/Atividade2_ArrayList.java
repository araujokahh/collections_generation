package collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2_ArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();

		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		int encontrarValor = sc.nextInt();
		int posicaoValor = valores.indexOf(encontrarValor);

		if (posicaoValor != -1) {
			System.out.println(
					"\nO número " + encontrarValor + " está localizado na posição: " + valores.indexOf(encontrarValor));

		} else {
			System.out.println("O número " + encontrarValor + " não foi encontrado!");
		}

		sc.close();
	}

}
