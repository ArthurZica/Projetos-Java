import java.util.Scanner;
//Exercicio 7 lista
//Arthur Augusto Zica de Almeida
/*Fa�a um programa que imprima os L primeiros elementos da s�rie de Fibonacci. Por 
exemplo, se o usu�rio digitou o n�mero 40, dever�o ser apresentados os 40 n�meros da 
sequ�ncia na tela*/
public class Exercicio7lista2 {

	public static void main(String[] args) 
	{
	//Declara��o de variaveis
	Scanner teclado = new Scanner(System.in);
	int l,t1=0,t2=1,t3;
	//Leitura
	System.out.println("Digite a quantidade de numeros da sequencia de fibonnaci que voc� deseja");
	l = teclado.nextInt();
	//Calculo
	System.out.println(t1);
	System.out.println(t2);
	l=l-2;
	for (int  i = 0; i < l; i++)
	{
	t3=t1+t2;//o termo 3 � igual ao termo 1 mais termo 2
	System.out.println(t3);//o termo 3 � exibido
	t1 = t2;//a cada loop o termo um � substituido pelo termo 2 anterior
	t2 = t3;//e o termo 2 pelo termo 3 anterior assim somando sempre os dois numeros anteriores fazendo a sequencia de fibonacci
	}
	
	
	
	
	
	teclado.close();

	}

}
