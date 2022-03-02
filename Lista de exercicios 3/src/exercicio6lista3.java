import java.util.Scanner;
//Exercicio 6 da 3º lista
/*Escreva uma função que recebe por parâmetro um valor inteiro e positivo N e retorna o
valor de S, calculado segundo a fórmula abaixo.
S = 1 + 1/1! + 1/2! + 1/3! + ...+1 /N!
Faça um programa que leia N e imprima o valor retornado pela função.*/
//Arthur Augusto Zica de Almeida

public class exercicio6lista3 {
	
	//Procedimento
	public static double calculafat(int total) {
	//Declaração de variaveis
	double E=1;
	//Estrutura de repetição
	for (int val=1; val <= total; val++)
	{
	int mult = 1;
	for (int ant=1; ant<=val; ant++)
	{
	mult = mult * ant;	
	}
	//Calcular Expressão
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
	//Chamada da função
	System.out.println("O total é " +calculafat(N));
	
	
	teclado.close();
	
	}

}
