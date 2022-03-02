import java.util.Scanner;
//Arthur Augusto Zica de Almeida 09/09/2021
/*Exercicio 9
 * Fazer um programa para:
• ler um símbolo do teclado;
• identificar com a estrutura SWITCH e mostrar as seguintes mensagens, segundo o 
caso:
o "SINAL DE MENOR"
o "SINAL DE MAIOR"
o "SINAL DE IGUAL"
o "OUTRO SINAL"
*/
public class Exercicio9lista {

	public static void main(String[] args)
	{
	//Declaração de variaveis
	Scanner teclado = new Scanner(System.in);	
	//Leitura
	System.out.println("Digite um simbolo no teclado");
	String opcao = teclado.nextLine();
	//Calculo e exibição
	switch (opcao)
	{
	case "<"://Caso o usuario digite sinal de menor a mensagem abaixo aparece
	System.out.println("SINAL DE MENOR");
	break;
	
	case ">"://Caso o usuario digite sinal de maior a mensagem abaixo aparece
	System.out.println("SINAL DE MAIOR");
	break;
	
	case "="://Caso o usuario digite sinal de igual a mensagem abaixo aparece
	System.out.println("SINAL DE IGUAL");
	break;
	
	default://Caso o usuario digite qualquer outro sinal a mensagem abaixo aparece
	System.out.println("OUTRO SINAL");
	
	}
	teclado.close();
	}

}
