import java.util.Scanner;
//Exercicio 3 da 3ºlista
/*Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem
crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento
para cada conjunto. (N deve ser lido do teclado)*/
//Arthur Augusto Zica de Almeida
public class exercicio3lista3 {
	
	//Procedimento
	public static void ordemcrescente() {
	Scanner entrada = new Scanner(System.in);
	//Variaveis
	int cnj = 0,N=1,a,b,c;
	//Leitura
	System.out.println("Quantos conjuntos serão calculados?");
	N = entrada.nextInt();
	//Calculos
	while (cnj<N) {
	System.out.println("Digite os tres numeros");
	a = entrada.nextInt();
	b = entrada.nextInt();
	c = entrada.nextInt();
	cnj++;
	if (a <= b && a <= c && b<=c) {//A forma encontrada para organizar em ordem crescente foi verificar se cada numero é menor que os outros
	System.out.printf("A ordem crescente é \n" + a + b + c);
	}
	else if (a <= b && a<=c && c <= b) {
	System.out.printf("A ordem crescente é \n" +a+c+b);
	}
	else if (b<=a && b<=c && a<=c) {
	System.out.printf("A ordem crescente é \n" +b+a+c);
	}
	else if (b<=a && b<=c && c<=a) {
	System.out.printf("A ordem crescente é \n" +b+c+a);
	}
	else if (c<=b && c<=a && a<=b) {
	System.out.printf("A ordem crescente é \n" +c+a+b);
	}
	else if (c<=b && c<=a && b<=a) {
	System.out.printf("A ordem crescente é \n " +c+b+a);
	}

	
	
	}
	
	entrada.close();
	}
	
	
	
	//Main 
	public static void main(String[] args) {
	//Chamada do procedimento
	ordemcrescente();
	System.out.println("Fim do programa");
	}

}
