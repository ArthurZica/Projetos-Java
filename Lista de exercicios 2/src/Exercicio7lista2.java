import java.util.Scanner;
//Exercicio 7 lista
//Arthur Augusto Zica de Almeida
/*Faça um programa que imprima os L primeiros elementos da série de Fibonacci. Por 
exemplo, se o usuário digitou o número 40, deverão ser apresentados os 40 números da 
sequência na tela*/
public class Exercicio7lista2 {

	public static void main(String[] args) 
	{
	//Declaração de variaveis
	Scanner teclado = new Scanner(System.in);
	int l,t1=0,t2=1,t3;
	//Leitura
	System.out.println("Digite a quantidade de numeros da sequencia de fibonnaci que você deseja");
	l = teclado.nextInt();
	//Calculo
	System.out.println(t1);
	System.out.println(t2);
	l=l-2;
	for (int  i = 0; i < l; i++)
	{
	t3=t1+t2;//o termo 3 é igual ao termo 1 mais termo 2
	System.out.println(t3);//o termo 3 é exibido
	t1 = t2;//a cada loop o termo um é substituido pelo termo 2 anterior
	t2 = t3;//e o termo 2 pelo termo 3 anterior assim somando sempre os dois numeros anteriores fazendo a sequencia de fibonacci
	}
	
	
	
	
	
	teclado.close();

	}

}
