import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 5
/* 
Valida e corrige número de telefone. Faça um programa que leia um número de telefone, e 
corrija  o  número  no  caso  deste  conter  somente  9  dígitos,  acrescentando  o  '9'  na  frente.  O 
usuário pode informar o número com ou sem o traço separador. 
Valida e corrige número de telefone 
Telefone: 8700-3001 
Telefone possui 8 dígitos. Vou acrescentar o digito nove na frente. 
Telefone corrigido sem formatação: 987003001 
Telefone corrigido com formatação: 98700-3001 
 */
public class Exercicio5Lista5 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	//Strings
	String numero;
	String nove = "9";
	String traço = "-";
	String meio;
	String fim;
	//Leitura
	System.out.println("Digite o numero do celular");
	numero = teclado.nextLine();
	//Se o numero tiver menos de nove digitos acrescenta o 9 na frente
	if (numero.length()<9) {
	numero = nove.concat(numero);
	}
	//Definindo meio e fim do numero pra adcionar traço
	meio  = numero.substring(0,5);
	fim = numero.substring(5,9);
	if (numero.length()>9) {
	numero = meio+fim;//Se o numero ja tiver o traço adcionado pelo usuario o programa nao faz nada	
	}
	else {
	numero = meio+traço+fim;//Senão o programa adciona o traço
	}	
	//Escreve
	System.out.println(numero);
	
	
	
	teclado.close();
	}

}
