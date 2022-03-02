import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 4
/*
 Palíndromo. Um palíndromo é uma  sequência de caracteres cuja leitura é idêntica se feita 
da direita para esquerda ou vice−versa. Por exemplo: OSSO e OVO são palíndromos. Em 
textos mais complexos os espaços e pontuação são ignorados. A frase SUBI NO ONIBUS 
é o exemplo de uma frase palíndroma onde os espaços foram ignorados. Faça um programa 
que leia uma sequência de caracteres, mostre−a e diga se é um palíndromo ou não. 
 */
public class Exercicio4lista5 {
	
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	//Leitura
	String palavra;
	System.out.println("Digite a palavra ou frase a ser verificada");
	palavra = teclado.nextLine();
	//Tirando espaços
	palavra = palavra.replaceAll("( )+", "");
	//Verificação 
	String Pinvertida = new StringBuffer(palavra).reverse().toString();//Criando um string novo que é a palavra invertida
	if(palavra.equals(Pinvertida)) {//Se a palavra digitada for igual ela invertida é palindromo se nao nao é.
	System.out.println("É Palindromo");
	}
	else {
	System.out.println("Não é palindromo");
		
	}
	teclado.close();
	}

}
