import java.util.Scanner;
//Exercicio 8 Lista
//Arthur Augusto Zica de Almeida
/*Faça um programa que imprima todos os elementos da série de Fibonacci menores que L.*/
public class Exercicio8lista2 {

	public static void main(String[] args) 
	{
		//Declaração de variaveis
		Scanner teclado = new Scanner(System.in);
		int l,t1=0,t2=1,t3;
		//Leitura
		System.out.println("Digite o numero L");
		l = teclado.nextInt();
		//Calculo
		System.out.println(t1);//Mostrar o numero 0
		System.out.println(t2);//Mostrar o numero 1
		l=l-2;//Retirar dois porque os numeros 0 e 1 ja foram mostrados
		for (int  i = 1; i < l; i++)//Com i sendo igual a 1 e i menor que L o numero final será sempre o ultimo da sequencia menor que L
		{
		t3=t1+t2;//o termo 3 é igual ao termo dois mais termo um
		System.out.println(t3);//o termo 3 é exibido
		t1 = t2;//a cada loop o termo um é substituido pelo termo 2 anterior
		t2 = t3;//e o termo 2 pelo termo 3 anterior assim somando sempre os dois numeros anteriores fazendo a sequencia de fibonacci
		}
		
		
		
		
		
		teclado.close();


	}

}
