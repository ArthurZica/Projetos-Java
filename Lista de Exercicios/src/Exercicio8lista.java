import java.util.Scanner;

//Exercicio 8 Lista
/*Construa um programa que l� uma op��o conforme abaixo (usar estrutura SWITCH) e o 
sal�rio atual do funcion�rio, calcula e exibe o novo sal�rio:
 A = aumento de 8% no sal�rio;
 B = aumento de 11% no sal�rio;
 C = aumento fixo no sal�rio */
// Arthur Augusto Zica de Almeida 09/09/2021 


public class Exercicio8lista {
//Declara��o de variaveis
	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	double salario,salA,salB;
	char opcao;
	// Leitura
	System.out.println("Digite o Valor do salario atual");
	salario = teclado.nextDouble();
	System.out.println("Escolha uma das op��es abaixo");
	System.out.println(" A = aumento de 8% no sal�rio");
	System.out.println(" B = aumento de 11% no sal�rio");
	System.out.println(" C = aumento fixo no sal�rio");
	teclado.nextLine();
	opcao = teclado.next().charAt(0);
	// Calculo e exibi��o
	salA = (salario * 8)/100;// formula do calculo dos 8%
	salB = (salario * 11)/100;// formula do calculo dos 11%
	switch (opcao)
	{
	case 'a'://Caso o usuario digite a ira fazer o calculo abaixo
	System.out.printf("O novo sal�rio � %.2f\n", salario+salA);
	break;
	
	case 'b'://Caso o usuario digite b ira fazer o calculo abaixo
	System.out.printf("O novo sal�rio � %.2f\n", salario+salB);
	break;
	
	case 'c'://Caso o usuario digite c ira fazer o calculo abaixo
	if (salario <= 1000)// se o salario for menor que 1000 o calculo ser� assim:
	{
	System.out.printf("O novo sal�rio � %.2f\n", salario+350);
	}
	else// se o salario for maior que 1000 o calculo ser� assim:
	{
	System.out.printf("O novo sal�rio � %.2f\n", salario+200);
	}
	break;
	
	}
	
	teclado.close();
	}
	}