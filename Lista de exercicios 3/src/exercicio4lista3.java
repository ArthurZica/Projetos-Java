import java.util.Scanner;
//Exercicio 4 da 3�lista
/*Escreva um procedimento que recebe 3 valores reais X, Y e Z e que verifique se esses
valores podem ser os comprimentos dos lados de um tri�ngulo e, neste caso, exibe qual � o
tipo de tri�ngulo formado. Para que X, Y e Z formem um tri�ngulo � necess�rio que a
seguinte propriedade seja satisfeita: o comprimento de cada lado de um tri�ngulo � menor
do que a soma do comprimento dos outros dois lados. O procedimento deve identificar o
tipo de tri�ngulo formado observando as seguintes defini��es:
- Tri�ngulo Equil�tero: os comprimentos dos 3 lados s�o iguais;
- Tri�ngulo Is�sceles: os comprimentos de pelo menos 2 lados s�o iguais.
- Tri�ngulo Escaleno: os comprimentos dos 3 lados s�o diferentes.
 Fa�a um programa que leia um n�mero indeterminado de tri�ngulos (valores dos 3 lados) e
 para cada tri�ngulo, acione o procedimento.*/
//Arthur Augusto Zica de Almeida

public class exercicio4lista3 {
	//Procedimento
	public static void triangulo() {
	//Declara��o de variaveis
	double x,y,z;
	int qtd=0,N=1;
	Scanner teclado = new Scanner(System.in);
	//Leitura
	System.out.println("Digite quantos triangulos ser�o lidos");
	N = teclado.nextInt();
	//Calculo
	while (qtd<N) {
	System.out.println("Digite os lados X Y e Z");
	x = teclado.nextDouble();
	y = teclado.nextDouble();
	z = teclado.nextDouble();
	qtd++;
	if (x+y>z && x+z>y && z+y>x) {//Cada if � um caso possivel
	System.out.println("Os 3 lados formam um triangulo");
	if (x == y && x == z){
	System.out.println("O triangulo � equilatero");
	}
	else if (x==y || y==z || x==z){
	System.out.println("O triangulo � isoceles");
	}	
	else {
	System.out.println("O triangulo � escaleno");
	}	
	}
	else {
	System.out.println("Os 3 lados nao formam um triangulo");
	}
		
	}
	
	
	teclado.close();
	
	}
	
	
	
	
	//main
	public static void main(String[] args) {
	//Chamada do procedimento
	triangulo();
	System.out.println("Fim do programa");
	}

}
