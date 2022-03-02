import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 5
/* 
Valida e corrige n�mero de telefone. Fa�a um programa que leia um n�mero de telefone, e 
corrija  o  n�mero  no  caso  deste  conter  somente  9  d�gitos,  acrescentando  o  '9'  na  frente.  O 
usu�rio pode informar o n�mero com ou sem o tra�o separador. 
Valida e corrige n�mero de telefone 
Telefone: 8700-3001 
Telefone possui 8 d�gitos. Vou acrescentar o digito nove na frente. 
Telefone corrigido sem formata��o: 987003001 
Telefone corrigido com formata��o: 98700-3001 
 */
public class Exercicio5Lista5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	//Strings
	String numero;
	String nove = "9";
	String tra�o = "-";
	String meio;
	String fim;
	//Leitura
	System.out.println("Digite o numero do celular");
	numero = teclado.nextLine();
	//Se o numero tiver menos de nove digitos acrescenta o 9 na frente
	if (numero.length()<9) {
	numero = nove.concat(numero);
	}
	//Definindo meio e fim do numero pra adcionar tra�o
	meio  = numero.substring(0,5);
	fim = numero.substring(5,9);
	if (numero.length()>9) {
	numero = meio+fim;//Se o numero ja tiver o tra�o adcionado pelo usuario o programa nao faz nada	
	}
	else {
	numero = meio+tra�o+fim;//Sen�o o programa adciona o tra�o
	}	
	//Escreve
	System.out.println(numero);
	
	
	
	teclado.close();
	}

}
