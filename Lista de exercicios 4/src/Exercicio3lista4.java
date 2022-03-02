import java.util.Scanner;
//Atividade 3 - Arthur Augusto Zica de Almeida
/*Faça uma função recursiva que calcula o resto da divisão usando subtrações sucessivas: 
int resto (int numerador, int denominador) 
Faça um programa que leia dois números, acione a função e exiba o resultado gerado. */
public class Exercicio3lista4 {
	
	//Função que calcula o resto
	public static int calcresto (int num, int den) {
	int resto = (num - den);//formula da subtração sucessiva	
	if (resto == num%den) {	//quando o resto da subtração for igual ao resto calculado pelo operador do java o programa retorna o resto calculado.
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
	System.out.print(+calcresto(num,den));//Chamada da função
	teclado.close();
	}

}
