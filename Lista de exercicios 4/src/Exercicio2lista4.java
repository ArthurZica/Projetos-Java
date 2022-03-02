import java.util.Scanner;
//Atividade 2 - Arthur Augusto Zica de Almeida
/*Faça uma função recursiva que calcula a divisão usando subtrações sucessivas: 
int divisao (int numerador, int denominador) 
Faça um programa que leia dois números, acione a função e exiba o resultado gerado. */
public class Exercicio2lista4 {
	
	//Calculo da divisão
	public static int calculadiv(int num, int den,int N) {
	int formula;
	formula = (num - den);//formula
	
	if(formula <=  0) {
	N++;
	return N; 
	}
	else {
	N++;
	return calculadiv(formula,den,N);
	}	
		
	}	
	//Main
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num,den,N=0;
	System.out.println("Digite o numerador e o denominador");
	num = teclado.nextInt();
	den = teclado.nextInt();
	System.out.print (+calculadiv(num,den, N));//Chama a função.
	
	teclado.close();
	}

}
