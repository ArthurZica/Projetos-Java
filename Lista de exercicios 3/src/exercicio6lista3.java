import java.util.Scanner;
//Exercicio 6 da 3� lista
/*Escreva uma fun��o que recebe por par�metro um valor inteiro e positivo N e retorna o
valor de S, calculado segundo a f�rmula abaixo.
S = 1 + 1/1! + 1/2! + 1/3! + ...+1 /N!
Fa�a um programa que leia N e imprima o valor retornado pela fun��o.*/
//Arthur Augusto Zica de Almeida

public class exercicio6lista3 {
	
	//Procedimento
	public static double calculafat(int total) {
	//Declara��o de variaveis
	double E=1;
	//Estrutura de repeti��o
	for (int val=1; val <= total; val++)
	{
	int mult = 1;
	for (int ant=1; ant<=val; ant++)
	{
	mult = mult * ant;	
	}
	//Calcular Express�o
	E=E+1.0/mult;
	}	
	return E;
	}
	//Main
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int N;		
	//Leitura
	System.out.println("Digite o valor de N");
	N = teclado.nextInt();
	//Chamada da fun��o
	System.out.println("O total � " +calculafat(N));
	
	
	teclado.close();
	
	}

}
