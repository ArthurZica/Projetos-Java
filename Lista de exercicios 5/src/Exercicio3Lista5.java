import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 3 
/*
Data  por  extenso.  Fa�a  um  programa  que  solicite  a  data  de  nascimento  (dd/mm/aaaa)  do 
usu�rio e imprima a data com o nome do m�s por extenso. 
Data de Nascimento: 03/03/1980 
Voc� nasceu em 03 de Mar�o de 1980. 	
 */


public class Exercicio3Lista5 {

	public static void main(String[] args) {
		//Criando Strings
		Scanner teclado = new Scanner (System.in);
		String data;
		String mes;
		String dia;
		String ano;
		
		//Leitura
		System.out.println("Digite a data no formato dd/mm/aaaa");
		data = teclado.nextLine();
		//Configurando string
		data = data.trim();
		data = data.replaceAll("/", "");
		dia = data.substring(0, 2);
		mes = data.substring(2, 4);
		ano = data.substring(4, 8);
		//Vetor com meses
		String[] extenso = {"Janeiro","Fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		//Transformando string para inteiro
		int mesInt = Integer.parseInt(mes);
		mesInt = mesInt-1;
		//Escreve a data na tela
		System.out.print("A data � "+dia +" De " +extenso[mesInt] +" De " +ano );
		
		teclado.close();
	}

}
