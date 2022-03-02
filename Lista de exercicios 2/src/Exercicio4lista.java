import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 4
/*Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o valor 
de E:
E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + .... + 1 / N!*/
public class Exercicio4lista {

	public static void main(String[] args) 
	{
	//Declaração de Variaveis	
	Scanner teclado = new Scanner(System.in);
	int N;
	double E=1;
	//Leitura
	System.out.println("Digite o valor de N");
	N = teclado.nextInt();
	//Calcular fatorial
	for (int val=1; val <= N; val++)
	{
	int mult = 1;
	for (int ant=1; ant<=val; ant++)
	{
	mult = mult * ant;	
	}
	//Calcular Expressão
	E=E+1.0/mult;
	}
	//Mensagem final
	System.out.println("O valor de E é igual a "+E);
	
	teclado.close();
	
	}

}
