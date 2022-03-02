import java.util.Scanner;
/*Faça um programa para ler os coeficientes de uma equação do primeiro grau (ax + b = 0), 
calcular e escrever a raiz da equação*/

//Arthur Augusto Zica de Almeida 08/09/2021
//Exercicio 6 Lista de atividades
public class Exercicio6Lista {

	//Declaração de variaveis
	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	double a,b,x;
	//Leitura
	System.out.println("Digite o valor do numero a:");
	a = teclado.nextDouble();
	System.out.println("Digite o valor do numero b:");
	b = teclado.nextDouble();
	//Calculo e exibição
	x = (-b/a);//Formula de resolução da equação
	if (a != 0)
	{
	System.out.printf("O valor de x é %.2f\n", x); 
	}
	else
	System.out.println("O valor de a não pode ser 0");// Se o valor de a for 0 não é possivel resolver a equação
	
	
	teclado.close();
	}

}
