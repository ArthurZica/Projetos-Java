import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 3
/*Fa�a um programa que receba dez n�meros e verifique se eles s�o divis�veis por 3 e 9 (ao 
mesmo tempo), por 2 e por 5. Caso algum n�mero n�o seja divis�vel por nenhum desses 
n�meros mostre a mensagem �N�mero n�o � divis�vel pelos valores�. Apresente tamb�m 
ao final a quantidade de n�meros divis�veis por 3 e 9, por 2 e por 5.*/
public class Exercicio3lista2 {

	public static void main(String[] args)
	{
	//Declara��o de variaveis
	Scanner teclado = new Scanner(System.in);
	int qtd = 0,num,div39 = 0,div2 = 0,div5 = 0;
	//Leitura
	while (qtd < 10)
	{
	System.out.println("Digite um numero:");
	num = teclado.nextInt();
	qtd ++;
	//Calculo e exibi��o
	if (num % 3== 0 && num % 9 == 0)
	{
	System.out.println("O numero � divisivel por 3 e 9");
	div39 ++;//Soma um nos numeros divisiveis por 3 e 9
	}
	if (num % 2 == 0)//Se o numero for divisivel por dois mostra a mensagem abaixo
	{	
	System.out.println("O numero � divisivel por 2");
	div2 ++;//Soma um nos numeros divisiveis por 2
	}	
	if (num % 5 == 0)//Se o numero for divisivel por cinco mostra a mensagem abaixo
	{	
	System.out.println("O numero � divisivel por 5");
	div5 ++;//Soma um nos numeros divisiveis por 5
	}	
	if ((num % 3!= 0 && num % 9 != 0)&& num % 2 != 0 && num % 5 != 0)//Se o numero nao for divisivel por nenhum dos numeros a mensagem abaixo � exibida
	{	
	System.out.println("N�mero n�o � divis�vel pelos valores");
	}	
	}
	System.out.printf("a quantidade de numeros divisiveis por 3 e 9 foi %d\n",div39);
	System.out.printf("a quantidade de numeros divisiveis por 2 foi %d\n",div2);
	System.out.printf("a quantidade de numeros divisiveis por 5 foi %d\n",div5);
	
	
	teclado.close();
	}

}
