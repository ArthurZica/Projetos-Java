import java.util.Scanner;

//Exercicio 8 Lista
/*Construa um programa que lê uma opção conforme abaixo (usar estrutura SWITCH) e o 
salário atual do funcionário, calcula e exibe o novo salário:
 A = aumento de 8% no salário;
 B = aumento de 11% no salário;
 C = aumento fixo no salário */
// Arthur Augusto Zica de Almeida 09/09/2021 


public class Exercicio8lista {
//Declaração de variaveis
	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	double salario,salA,salB;
	char opcao;
	// Leitura
	System.out.println("Digite o Valor do salario atual");
	salario = teclado.nextDouble();
	System.out.println("Escolha uma das opções abaixo");
	System.out.println(" A = aumento de 8% no salário");
	System.out.println(" B = aumento de 11% no salário");
	System.out.println(" C = aumento fixo no salário");
	teclado.nextLine();
	opcao = teclado.next().charAt(0);
	// Calculo e exibição
	salA = (salario * 8)/100;// formula do calculo dos 8%
	salB = (salario * 11)/100;// formula do calculo dos 11%
	switch (opcao)
	{
	case 'a'://Caso o usuario digite a ira fazer o calculo abaixo
	System.out.printf("O novo salário é %.2f\n", salario+salA);
	break;
	
	case 'b'://Caso o usuario digite b ira fazer o calculo abaixo
	System.out.printf("O novo salário é %.2f\n", salario+salB);
	break;
	
	case 'c'://Caso o usuario digite c ira fazer o calculo abaixo
	if (salario <= 1000)// se o salario for menor que 1000 o calculo será assim:
	{
	System.out.printf("O novo salário é %.2f\n", salario+350);
	}
	else// se o salario for maior que 1000 o calculo será assim:
	{
	System.out.printf("O novo salário é %.2f\n", salario+200);
	}
	break;
	
	}
	
	teclado.close();
	}
	}