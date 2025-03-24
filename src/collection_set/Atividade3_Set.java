package collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3_Set {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> setValores = new HashSet<Integer>();

		System.out.println("Digite 10 números inteiros e não repetidos: ");
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());
		setValores.add(sc.nextInt());

		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iValores = setValores.iterator();

		while (iValores.hasNext()) {
			System.out.println(iValores.next());

		}

		sc.close();

	}

}
