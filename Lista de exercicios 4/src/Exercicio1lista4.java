import java.util.Scanner;
/*Faça  uma  função  para  encontrar  a  soma  dos  dígitos  de  um  número  usando  recursão.  Faça 
um programa principal que leia um número, acione a função e exiba o resultado gerado. */
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
	System.out.print (+somadig(N));//executa a função
	teclado.close();
	}

}
