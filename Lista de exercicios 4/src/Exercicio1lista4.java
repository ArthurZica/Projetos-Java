import java.util.Scanner;
/*Fa�a  uma  fun��o  para  encontrar  a  soma  dos  d�gitos  de  um  n�mero  usando  recurs�o.  Fa�a 
um programa principal que leia um n�mero, acione a fun��o e exiba o resultado gerado. */
//Atividade 1 - Arthur Augusto Zica de Almeida

public class Exercicio1lista4 {

	public static int somadig(int N) {
		
		if (N<10) {//Se N for menor que 10 retorna n
		return N;
		}
		else {
		return N%10+somadig(N/10);//soma dos digitos
		}
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int N;
	System.out.println("Digite o numero que sera somado");
	N = teclado.nextInt();//le o numero
	System.out.print (+somadig(N));//executa a fun��o
	teclado.close();
	}

}
