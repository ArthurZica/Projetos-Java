import java.util.Scanner;

public class Exercicio5lista4 {
//Atividade 5 - Arthur Augusto Zica de Almeida
/*Fa�a uma fun��o recursiva que calcula o valor de S da s�rie a seguir para n > 0: 
 
    S = 1/1! + 1/2!  + 1/3! + ...+1 /N! 
 
	double serie (int n) 
 Fa�a um programa que leia um n�mero, acione a fun��o e exiba o resultado gerado. */
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
	System.out.println(+fatorial(n));//Chamada da fun��o
	
	
	teclado.close();
	}

}
