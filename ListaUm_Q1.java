//Faca um algoritmo em Java para ler, usando o teclado, um numero do tipo inteiro, um do tipo long
//e outro do tipo float. Realize a leitura dos numeros obedecendo a ordem descrita e exiba-os no con-
//sole utilizando o printf (System.out.printf()) na mesma ordem. Formato da saıda (”O numero inteiro
//digitado foi NUMERO INTEIRO, o numero long digitado foi NUMERO  LONG e o numero float foi
//NUMERO FLOAT.”)

import java.util.Scanner;

public class ListaUm_Q1{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro");
		int a = sc.nextInt();
		System.out.println("Digite um número long");
		long b = sc.nextLong();
		System.out.println("Digite um número float");
		float c = sc.nextFloat();
		
		System.out.println("O número inteiro digitado foi "+ a + 
								", o número long digitado foi "+ b +
									", o número float digitado foi " + c);
		
		
		sc.close();
	}

}