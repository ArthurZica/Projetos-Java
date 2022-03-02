import java.util.Scanner;
//Exercicio 6 lista
//Arthur Augusto Zica de Almeida
/* Escreva um algoritmo que lê um valor n inteiro e positivo e que calcula a seguinte soma: 
S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
O algoritmo deve escrever cada termo gerado e o valor final de S*/
public class Exercicio6lista2 {

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	//Declaração de variaveis
	int n;
	double S=0;
	//Leitura
	System.out.println("Digite o valor de n");
	n = teclado.nextInt();
	//Calculo
	for ( int val = 1; n>0 && val<=n; val++) {//Enquanto o valor foi menor ou igual a n a formula se repete
	//formula
		S=S+1.0/val;//S é igual a  S mais 1 dividido por valor (S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n)
		System.out.println(S);//Mostrar todos termos gerados (S)
	}
	if (n>0) {
		System.out.print("O valor de S é " +S);//Exibir o resultado final
	}
	else {
		System.out.println("O valor digitado foi negativo reinicie o programa");//Mensagem caso o usuario digite um valor negativo
	}
	
	
	teclado.close();

	}

}
