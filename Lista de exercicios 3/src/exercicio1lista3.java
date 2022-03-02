import java.util.Scanner;
//Exercicio 1 3º Lista
/*Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. Se a
letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, se for
‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). Faça um programa que leia 3
notas de N alunos e acione o procedimento para cada aluno. (N deve ser lido do teclado)*/
//Arthur Augusto Zica de Almeida
public class exercicio1lista3 {

	//Proceedimento
	public static void calculanota () {
	//Variaveis
	int contaAluno = 0,N=1;
	double nt1 = 0, nt2 = 0, nt3 = 0; 
	char opcao;
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite quantos alunos terão as notas lidas");
	N = entrada.nextInt();
	
	while (contaAluno<N) {//Enquanto a contagem de alunos for menor que N inserido o programa repete
	System.out.println("Digite as 3 notas do aluno");
	double resultarit = (nt1+nt2+nt3)/3;
	nt1 = entrada.nextDouble();
	nt2 = entrada.nextDouble();
	nt3 = entrada.nextDouble();
	contaAluno++;
	System.out.println("Digite A-> para calcular media aritimetica e P-> para calcular media ponderada");
	opcao = entrada.next().charAt(0);
	if (opcao == 'A' || opcao == 'a') {//Se a opção escolhida foi A a media calculada sera aritmetica
	System.out.printf("A media do aluno foi %.2f\n ",resultarit);
	}
	if (opcao == 'P' || opcao == 'p');{//Se a opção escolhida for p a media calculada sera a ponderada
	System.out.printf("A media do aluno foi %f\n ",((nt1*5)+(nt2*3)+(nt3*2))/10);
	
	}
	}
	entrada.close();
	}
	//Main
	public static void main(String[] args) {
	//Chamada do procedimento
	calculanota();
	System.out.println("Fim do programa");
	}

}
