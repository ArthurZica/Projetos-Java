import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 2
/*Adaptar o programa 1 para que ele calcule o percentual dos valores positivos, 
negativos e zeros em relação ao total de valores fornecidos.*/
public class Exercicio2lista3 {

	public static void main(String[] args)
	{
		//Declaração de variaveis
		Scanner teclado = new Scanner(System.in);
		
		int pctPOS = 0,pctNEG,pctZER,val=0,qtd=0,conta=0,positivo=0,negativo=0,zeros = 0;	
		//Leitura
		System.out.println("Digite a quantidade de numeros que irão ser inseridos: ");
		qtd = teclado.nextInt();
		//Gravação dos numeros
		while (conta<qtd) {
		System.out.print("Digite um numero positivo, negativo ou 0: ");
		val = teclado.nextInt();
		conta++; //Soma mais um a quantidade de numeros digitados
		if (val>0) 
		{
		positivo++;	//Soma mais um a quantidade de positivos	
		}
		else if (val<0)
		{
		negativo++;//Soma mais um a quantidade de negativos
		}
		else
		{
		zeros++;//Soma mais um a quantidade de zeros
		}
		}
		//Formulas de porcentagem
		pctPOS = ((positivo*100)/qtd);
		pctNEG = ((negativo*100)/qtd);
		pctZER = ((zeros*100)/qtd);
		//Exibição
		System.out.printf("A porcentagem de numeros positivos foi %d\n", pctPOS);
		System.out.printf("A porcentagem de numeros negativos foi %d\n", pctNEG);
		System.out.printf("A porcentagem de zeros foi %d\n", pctZER);
		teclado.close();
	}

}
