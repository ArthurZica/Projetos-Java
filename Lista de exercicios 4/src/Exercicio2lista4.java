import java.util.Scanner;
//Atividade 2 - Arthur Augusto Zica de Almeida
/*Fa�a uma fun��o recursiva que calcula a divis�o usando subtra��es sucessivas: 
int divisao (int numerador, int denominador) 
Fa�a um programa que leia dois n�meros, acione a fun��o e exiba o resultado gerado. */
public class Exercicio2lista4 {
	
	//Calculo da divis�o
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
	System.out.print (+calculadiv(num,den, N));//Chama a fun��o.
	
	teclado.close();
	}

}
