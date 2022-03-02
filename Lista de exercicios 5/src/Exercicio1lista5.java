import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 1 
/*
Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas iniciais. 
As  iniciais  são  formadas  pela  primeira  letra  de  cada  nome,  sendo  que  todas  deverão 
aparecer em maiúsculas na saída do programa. Note que os conectores e, do, da, dos, das, 
de,  di,  du  não  são  considerados  nomes  e,  portanto,  não  devem  ser  considerados  para  a 
obtenção  das  iniciais.  As  iniciais  devem  ser  impressas  em  maiúsculas,  ainda  que  o  nome 
seja entrado todo em minúsculas. Exemplos: 
José Carlos Souza => JCS 
Nome do Fulano => NF 
Heloísa Martins Vieira => HMV 
 */
public class Exercicio1lista5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	//Criando String
	String nome;
	//Lendo o nome
	System.out.println("Digite o nome");
	nome = teclado.nextLine().toUpperCase();
	//Pegando as iniciais
	System.out.println("As suas iniciais são");
	System.out.print(nome.charAt(0));//Exibe o primeiro caracter
	
	for (int i=0; i < nome.length(); i++) {
	if(nome.charAt(i) == ' ') {
	 System.out.print(nome.charAt(i + 1));
	}	
	}
	/*Esse for passa por cada caracter da string e quando encontra um 
	 * espaço adciona a proxima letra as iniciais
	 */
	
	
	teclado.close();

	}

}
