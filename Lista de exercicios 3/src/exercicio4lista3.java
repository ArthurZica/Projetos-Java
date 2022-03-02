import java.util.Scanner;
//Exercicio 4 da 3ºlista
/*Escreva um procedimento que recebe 3 valores reais X, Y e Z e que verifique se esses
valores podem ser os comprimentos dos lados de um triângulo e, neste caso, exibe qual é o
tipo de triângulo formado. Para que X, Y e Z formem um triângulo é necessário que a
seguinte propriedade seja satisfeita: o comprimento de cada lado de um triângulo é menor
do que a soma do comprimento dos outros dois lados. O procedimento deve identificar o
tipo de triângulo formado observando as seguintes definições:
- Triângulo Equilátero: os comprimentos dos 3 lados são iguais;
- Triângulo Isósceles: os comprimentos de pelo menos 2 lados são iguais.
- Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.
 Faça um programa que leia um número indeterminado de triângulos (valores dos 3 lados) e
 para cada triângulo, acione o procedimento.*/
//Arthur Augusto Zica de Almeida

public class exercicio4lista3 {
	//Procedimento
	public static void triangulo() {
	//Declaração de variaveis
	double x,y,z;
	int qtd=0,N=1;
	Scanner teclado = new Scanner(System.in);
	//Leitura
	System.out.println("Digite quantos triangulos serão lidos");
	N = teclado.nextInt();
	//Calculo
	while (qtd<N) {
	System.out.println("Digite os lados X Y e Z");
	x = teclado.nextDouble();
	y = teclado.nextDouble();
	z = teclado.nextDouble();
	qtd++;
	if (x+y>z && x+z>y && z+y>x) {//Cada if é um caso possivel
	System.out.println("Os 3 lados formam um triangulo");
	if (x == y && x == z){
	System.out.println("O triangulo é equilatero");
	}
	else if (x==y || y==z || x==z){
	System.out.println("O triangulo é isoceles");
	}	
	else {
	System.out.println("O triangulo é escaleno");
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
