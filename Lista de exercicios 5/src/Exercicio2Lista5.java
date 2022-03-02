import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 2
/*
Faça  um  programa  que,  a  partir  de  um  texto  digitado  pelo  usuário,  imprima  o  texto 
removendo  todos  os  espaços  em  branco  adicionais  encontrados,  de  modo  que  haja,  no 
máximo, um espaço em branco separando as palavras presentes nesse texto. 
 */
public class Exercicio2Lista5 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	//Lendo o texto
	String texto;
	System.out.println("Digite o texto");
	texto = entrada.nextLine();
	//Tirando espaços em branco
	texto = texto.replaceAll("( )+", " ");//Se tiver um espaço maior em branco maior que " " ele sera substituido por " "
	//Escreve o texto
	System.out.print(texto);
	
	
	
	
	
	entrada.close();

	}

}
