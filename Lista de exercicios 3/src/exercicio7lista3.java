import java.util.Scanner;

public class exercicio7lista3 {
//Exercicio 7 da 3º Lista
/*Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo.
A função deve retornar um valor lógico (true ou false). Faça um programa que lê N
números e para cada um deles exibe uma mensagem informando se ele é positivo ou não,
dependendo se foi retornado verdadeiro ou falso pela função.*/
//Arthur Augusto Zica de Almeida	
	
	//Função
	public static boolean verifica (int N) {
	boolean verificação=(N>0);	
	return verificação;
	}
	//Main
	public static void main(String[] args) {
	int N = 1;
	Scanner teclado = new Scanner (System.in);
	//Enquanto N for diferente de 0 o programa repete
	while (N !=0 ) {
	System.out.println("Digite um numero inteiro");
	N = teclado.nextInt();
	//Chamada da função
	verifica(N);
	if(verifica(N)==true) {//Se o valor da função for true o numero é positivo
	System.out.println("O numero é positivo");
	}
	else if(N==0) {
	System.out.println("O numero é 0");	
	}
	else {//Se o valor da função for false o numero é negativo
	System.out.println("O numero é negativo");	
	}
	}
	teclado.close();
	System.out.println("Fim do programa");
	}

}
