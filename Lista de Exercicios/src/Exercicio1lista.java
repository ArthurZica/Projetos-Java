import java.util.Scanner;

//Atividade 1 Lista de exercicios (06/09)
//Ler dois numeros e ao final do programa exibir o maior deles
public class Exercicio1lista {
	public static void main(String[] args)
	{
	// Declara��o das vari�veis 
	Scanner teclado = new Scanner(System.in);// Entrada do teclado
	double num1,num2;// Numeros que ser�o usados no calculo
	// Leitura
	System.out.println("Digite o Pimeiro numero"); // Leitura do primeiro numero
	num1 = teclado.nextDouble();
	System.out.println("Digite o Segundo numero");// Leitura do segundo numero
	num2 = teclado.nextDouble();
	// Calculo e exibi��o
	if (num1 > num2) // Se o numero  1 for maior que o 2 ser� exibido ele, sen�o ser� exibido o numero 2
	{ 
		System.out.printf("O Maior numero � %.2f\n",num1);
	}
	else
	{
		System.out.printf("O maior numero � %.2f\n",num2);
	}
	
	
	teclado.close();
	}

}
