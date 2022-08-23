//Construa um algoritmo que faca a leitura de dois numeros inteiros e imprima no console qual numero
 //é o maior, se o primeiro ou o segundo.

import java.util.Scanner;

public class ListaUm_Q4{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int a = sc.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println("O primeiro número é maior que o segundo" );
		} else {
			System.out.println("O segundo número é maior que o primeiro");
		}

		sc.close();
	}

}
