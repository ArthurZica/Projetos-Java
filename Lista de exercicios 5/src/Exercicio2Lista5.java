import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 2
/*
Fa�a  um  programa  que,  a  partir  de  um  texto  digitado  pelo  usu�rio,  imprima  o  texto 
removendo  todos  os  espa�os  em  branco  adicionais  encontrados,  de  modo  que  haja,  no 
m�ximo, um espa�o em branco separando as palavras presentes nesse texto. 
 */
public class Exercicio2Lista5 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	//Lendo o texto
	String texto;
	System.out.println("Digite o texto");
	texto = entrada.nextLine();
	//Tirando espa�os em branco
	texto = texto.replaceAll("( )+", " ");//Se tiver um espa�o maior em branco maior que " " ele sera substituido por " "
	//Escreve o texto
	System.out.print(texto);
	
	
	
	
	
	entrada.close();

	}

}
