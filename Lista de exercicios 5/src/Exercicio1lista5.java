import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 1 
/*
Escreva um programa que, a partir de um nome informado pelo usu�rio, exiba suas iniciais. 
As  iniciais  s�o  formadas  pela  primeira  letra  de  cada  nome,  sendo  que  todas  dever�o 
aparecer em mai�sculas na sa�da do programa. Note que os conectores e, do, da, dos, das, 
de,  di,  du  n�o  s�o  considerados  nomes  e,  portanto,  n�o  devem  ser  considerados  para  a 
obten��o  das  iniciais.  As  iniciais  devem  ser  impressas  em  mai�sculas,  ainda  que  o  nome 
seja entrado todo em min�sculas. Exemplos: 
Jos� Carlos Souza => JCS 
Nome do Fulano => NF 
Helo�sa Martins Vieira => HMV 
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
	System.out.println("As suas iniciais s�o");
	System.out.print(nome.charAt(0));//Exibe o primeiro caracter
	
	for (int i=0; i < nome.length(); i++) {
	if(nome.charAt(i) == ' ') {
	 System.out.print(nome.charAt(i + 1));
	}	
	}
	/*Esse for passa por cada caracter da string e quando encontra um 
	 * espa�o adciona a proxima letra as iniciais
	 */
	
	
	teclado.close();

	}

}
