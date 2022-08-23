//Escreva um algoritmo em Java para realizar o calculo de  ́area de um trapezio retangulo. Todas as
//entradas do usuario devem estar em cm. A saıda do algoritmo deve ser a  ́area do trapezio em cm2 no
//console (e.g. ”A  ́area do trapezio em cm2  ́e ”). A = (((basemaior+basemenor)*altura)/2)

import java.util.Scanner;

public class ListaUm_Q3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior: ");
		float baseMaior = sc.nextFloat();
		System.out.println("Digite o valor da base menor: ");
		float baseMenor = sc.nextFloat();
		System.out.println("Digite o valor da altura: ");
		float altura = sc.nextFloat();
		
		float area = (((baseMaior+baseMenor)*altura)/2);
		
		System.out.println("A área do trapézio em cm² é: " + area);

		sc.close();
	}

}
