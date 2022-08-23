//Elabore um algoritmo em Java para identificar se um numero  ́e par ou  ́ımpar.

import java.util.Scanner;

public class ListaUm_Q5{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para descobrir se ele é ímpar ou par:");
		int a = sc.nextInt();
		
		if (a%2 == 0) {
			System.out.println("O número é PAR" );
		} else {
			System.out.println("O número é ÍMPAR");
		}

		sc.close();

	}

}
