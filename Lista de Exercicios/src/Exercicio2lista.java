//Exercicio 2 Ler dois numeros, somar os dois, caso o resultado seja maior que 10 somar 5 e imprimir,se for menor que 10 somar 7 e imprimir 
import java.util.Scanner;

public class Exercicio2lista {

	public static void main(String[] args)
	{
		//Declaração de Variaveis
		
	Scanner teclado = new Scanner(System.in);// Entrada do teclado
	int num1,num2,soma;// Numeros que serão usados no calculo
		
	//Leitura
	
	System.out.println("Digite o Primeiro numero");// Leitura do primeiro numero
	num1 = teclado.nextInt();
	System.out.println("Digite o Segundo numero");// Leitura do segundo numero
	num2 = teclado.nextInt();
		
	//Calculo e Exibição
	
	soma = num1+num2;
	if (soma >= 10) // Se a soma for maior que 10 entao o resultado é a soma + 5
	{
		System.out.printf("O resultado é %d\n ", soma + 5);
	}
	else // Senão o resultado é soma + 7
	
	System.out.printf("O resultado é %d\n ", soma + 7);
	
	
	teclado.close();
	}

}
