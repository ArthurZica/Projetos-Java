import java.util.Scanner;
// Arthur Augusto Zica de Almeida 09/09/2021
//Exercicio 7
//Fa�a um programa para calcular e imprimir o valor de Y, dado um valor de X
public class Exercicio7Lista {

	public static void main(String[] args)
	{
	Scanner teclado = new Scanner(System.in);
	double x;
	//Leitura
	System.out.println("Digite o valor de x");
	x = teclado.nextDouble(); 
	//Calculo e exibi��o
	if (x <= 1)// Se x menor ou igual a 1 o valor de y � 1
	{
	System.out.println("O valor de Y � 1");
	}
	else if (x > 1 && x <= 2)// Se x maior que 1 e menor ou igual a 2 o valor de y � 2
	{
	System.out.println("O valor de Y � 2");
	}
	else if (x > 2 && x <= 3)// Se x maior que 2 e menor ou igual a 3 o valor de y � x^2
	{
	System.out.printf("O valor de Y � %.2f\n", Math.pow (x, 2));
	}
	else // Se x maior que 3 o valor de y � x^3
	System.out.printf("O valor de Y � %.2f\n", Math.pow (x, 3));
	teclado.close();
	}

}
