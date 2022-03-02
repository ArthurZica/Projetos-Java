import java.util.Scanner;
//Atividade 3 - Arthur Augusto Zica de Almeida
/*Fa�a uma fun��o recursiva que calcula o resto da divis�o usando subtra��es sucessivas: 
int resto (int numerador, int denominador) 
Fa�a um programa que leia dois n�meros, acione a fun��o e exiba o resultado gerado. */
public class Exercicio3lista4 {
	
	//Fun��o que calcula o resto
	public static int calcresto (int num, int den) {
	int resto = (num - den);//formula da subtra��o sucessiva	
	if (resto == num%den) {	//quando o resto da subtra��o for igual ao resto calculado pelo operador do java o programa retorna o resto calculado.
		return resto;
	}
	else {
		return calcresto(resto,den);
	}
	}
	//Main
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num,den;
	System.out.println("Digite o numerador e denominador");
	num = teclado.nextInt();
	den = teclado.nextInt();
	System.out.print(+calcresto(num,den));//Chamada da fun��o
	teclado.close();
	}

}
