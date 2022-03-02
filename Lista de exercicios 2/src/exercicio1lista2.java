import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 1
/*Fazer um programa leia uma seqüência de valores inteiros fornecida pelo usuário em uma 
linha de entrada e conte o número de valores positivos, negativos e zeros.*/
public class exercicio1lista2 {

	public static void main(String[] args) 
	{
	//Declaração de variaveis
	Scanner teclado = new Scanner(System.in);
	
	int val=0,qtd=0,conta=0,positivo=0,negativo=0,zeros = 0;	
	//Leitura
	System.out.println("Digite a quantidade de numeros que irão ser inseridos: ");
	qtd = teclado.nextInt();
	//"Calculos"
	while (conta<qtd) {
	System.out.print("Digite um numero positivo, negativo ou 0: ");
	val = teclado.nextInt();
	conta++;	//Soma mais um a quantidade de numeros digitados
	if (val>0) 
	{
	positivo++;	//Soma mais um a quantidade de positivos
	}
	else if (val<0)
	{
	negativo++;	//Soma mais um a quantidade de negativos
	}
	else
	{
	zeros++;	//Soma mais um a quantidade de zeros
	}
	
	}
	//Exibição dos resultados
	System.out.printf("A quantidade de positivos foram: %d\n", positivo);
	System.out.printf("A quantidade de negativos foram: %d\n", negativo);
	System.out.printf("A quantidade de zeros foi: %d\n", zeros);
	
	
	teclado.close();

	}

}
