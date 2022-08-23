//Crie um algoritmo em Java para realizar o calculo de IMC. A saıda do algoritmo deve ser o valor do
//IMC no console (e.g. ”O valor do seu IMC  ́e ”). imc = peso / altura*2
//Com 2 casas decimais

import java.util.Scanner;

public class ListaUm_Q2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o seu peso: ");
		float peso = sc.nextFloat();
		System.out.println("Digite a sua altura: ");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura*altura);
		
		System.out.printf("O valor do seu IMC é: %.2f", imc);

		sc.close();
	}

}