import java.util.Scanner;

/*Fa�a um algoritmo que segundo uma nota informada pelo usu�rio, verifique em qual faixa 
a mesma se encaixa e imprima para o usu�rio a mensagem correspondente*/
public class Exercicio4lista {

	public static void main(String[] args) 
	{
	// Declara��o de Variaveis	
	Scanner teclado = new Scanner(System.in);
	double nota;
	// Leitura
	System.out.println("Digite A sua nota");
	nota = teclado.nextDouble();
	//Calculo e Exibi��o
	if (nota>=8 && nota <=10)// Se a nota for maior ou igual a 8 e menor ou igual a 10 a mensagem abaixo � exibida
	{
	System.out.println("O resultado foi otimo");
	}
	else if (nota >=7 && nota <8)// Se a nota for maior ou igual a 7 e menor que 8 a mensagem abaixo � exibida
	{
	System.out.println("O resultado foi bom");
	}
	else if (nota >= 5 && nota<7)/// Se a nota for maior ou igual a 5 e menor que 7 a mensagem abaixo � exibida
	{
	System.out.println("O resultado foi regular");	
	}	
	else if (nota <5 && nota >=0)// Se a nota for maior ou igual a 0 e menor que 5 a mensagem abaixo � exibida
	{
	System.out.println("O resultado foi insatisfat�rio");
	}
	else// Caso o numero seja menor que 0 ou maior que 10 a mensagem abaixo � exibida
	System.out.println("Erro! Insira uma nota de 0 a 10");
	teclado.close();
	}

}
