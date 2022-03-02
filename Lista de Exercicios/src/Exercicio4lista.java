import java.util.Scanner;

/*Faça um algoritmo que segundo uma nota informada pelo usuário, verifique em qual faixa 
a mesma se encaixa e imprima para o usuário a mensagem correspondente*/
public class Exercicio4lista {

	public static void main(String[] args) 
	{
	// Declaração de Variaveis	
	Scanner teclado = new Scanner(System.in);
	double nota;
	// Leitura
	System.out.println("Digite A sua nota");
	nota = teclado.nextDouble();
	//Calculo e Exibição
	if (nota>=8 && nota <=10)// Se a nota for maior ou igual a 8 e menor ou igual a 10 a mensagem abaixo é exibida
	{
	System.out.println("O resultado foi otimo");
	}
	else if (nota >=7 && nota <8)// Se a nota for maior ou igual a 7 e menor que 8 a mensagem abaixo é exibida
	{
	System.out.println("O resultado foi bom");
	}
	else if (nota >= 5 && nota<7)/// Se a nota for maior ou igual a 5 e menor que 7 a mensagem abaixo é exibida
	{
	System.out.println("O resultado foi regular");	
	}	
	else if (nota <5 && nota >=0)// Se a nota for maior ou igual a 0 e menor que 5 a mensagem abaixo é exibida
	{
	System.out.println("O resultado foi insatisfatório");
	}
	else// Caso o numero seja menor que 0 ou maior que 10 a mensagem abaixo é exibida
	System.out.println("Erro! Insira uma nota de 0 a 10");
	teclado.close();
	}

}
