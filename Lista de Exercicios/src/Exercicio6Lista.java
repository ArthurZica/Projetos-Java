import java.util.Scanner;
/*Fa�a um programa para ler os coeficientes de uma equa��o do primeiro grau (ax + b = 0), 
calcular e escrever a raiz da equa��o*/

//Arthur Augusto Zica de Almeida 08/09/2021
//Exercicio 6 Lista de atividades
public class Exercicio6Lista {

	//Declara��o de variaveis
	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	double a,b,x;
	//Leitura
	System.out.println("Digite o valor do numero a:");
	a = teclado.nextDouble();
	System.out.println("Digite o valor do numero b:");
	b = teclado.nextDouble();
	//Calculo e exibi��o
	x = (-b/a);//Formula de resolu��o da equa��o
	if (a != 0)
	{
	System.out.printf("O valor de x � %.2f\n", x); 
	}
	else
	System.out.println("O valor de a n�o pode ser 0");// Se o valor de a for 0 n�o � possivel resolver a equa��o
	
	
	teclado.close();
	}

}
