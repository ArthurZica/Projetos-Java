import java.util.Scanner;

public class Exercicio5lista4 {
//Atividade 5 - Arthur Augusto Zica de Almeida
/*Faça uma função recursiva que calcula o valor de S da série a seguir para n > 0: 
 
    S = 1/1! + 1/2!  + 1/3! + ...+1 /N! 
 
	double serie (int n) 
 Faça um programa que leia um número, acione a função e exiba o resultado gerado. */
//Nao consegui fazer, fiz apenas fatorial para nao deixar em branco.
	
	//Calculo do fatorial
	public static double fatorial (int n) {
	if(n == 0) {
	return 1;
	}
	else {
	return n*fatorial(n-1);
	}
	}
	
	
	//Main
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);	
	int n;
	System.out.println("Digite o valor de N");
	n = teclado.nextInt();
	System.out.println(+fatorial(n));//Chamada da função
	
	
	teclado.close();
	}

}
