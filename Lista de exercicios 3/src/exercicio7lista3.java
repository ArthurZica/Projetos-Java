import java.util.Scanner;

public class exercicio7lista3 {
//Exercicio 7 da 3� Lista
/*Fa�a uma fun��o que recebe um valor inteiro e verifica se o valor � positivo ou negativo.
A fun��o deve retornar um valor l�gico (true ou false). Fa�a um programa que l� N
n�meros e para cada um deles exibe uma mensagem informando se ele � positivo ou n�o,
dependendo se foi retornado verdadeiro ou falso pela fun��o.*/
//Arthur Augusto Zica de Almeida	
	
	//Fun��o
	public static boolean verifica (int N) {
	boolean verifica��o=(N>0);	
	return verifica��o;
	}
	//Main
	public static void main(String[] args) {
	int N = 1;
	Scanner teclado = new Scanner (System.in);
	//Enquanto N for diferente de 0 o programa repete
	while (N !=0 ) {
	System.out.println("Digite um numero inteiro");
	N = teclado.nextInt();
	//Chamada da fun��o
	verifica(N);
	if(verifica(N)==true) {//Se o valor da fun��o for true o numero � positivo
	System.out.println("O numero � positivo");
	}
	else if(N==0) {
	System.out.println("O numero � 0");	
	}
	else {//Se o valor da fun��o for false o numero � negativo
	System.out.println("O numero � negativo");	
	}
	}
	teclado.close();
	System.out.println("Fim do programa");
	}

}
