import java.util.Scanner;
//Exercicio 5  da 3� lista
/*Fa�a um procedimento que recebe a m�dia final de um aluno, identifica e exibe o seu
conceito, conforme a tabela abaixo. Fa�a um programa que leia a m�dia de N alunos,
acionando o procedimento para cada um deles. (N deve ser lido do teclado)
Nota Conceito
At� 39 F
40 a 59 E
60 a 69 D
70 a 79 C
80 a 89 B
A partir de 90 A*/
//Arthur Augusto Zica de Almeida

public class exercicio5lista3 {
	//Procedimento
	public static void notasproc() {
	Scanner teclado = new Scanner(System.in);
	//Declara��o de variaveis
	int qtd = 0,N=1;
	double nota = 0;
	//Leitura
	System.out.println("Digite a quantidade de alunos que serao inseridos");
	N = teclado.nextInt();
	while (qtd<N) {//Enquanto a quantidade de alunos inseridos for menor que n o programa repete.
	System.out.println("Digite a media");
	nota = teclado.nextDouble();
	qtd++;
	if(nota<=39) {//Cada if � um caso dos informados no enunciado do exercicio
	System.out.println("Seu conceito �: F");
	}	
	else if(nota>39 && nota <= 59){
		System.out.println("Seu conceito �: E");
	}
	else if(nota>59 && nota <= 69){
		System.out.println("Seu conceito �: D");
	}
	else if(nota>69 && nota <= 79){
		System.out.println("Seu conceito �: C");
	}
	else if(nota>79 && nota <= 89){
		System.out.println("Seu conceito �: B");
	}
	else if(nota>89){
		System.out.println("Seu conceito �: A");
	}
	}	
	
	
	
	teclado.close();
	
	}
	
	
	//Main
	public static void main(String[] args) {
	//Chamada do procedimento
		notasproc();
		System.out.println("Fim do programa");

	}

}
