//Atividade 3 Lista de Exercicios
//Arthur Augusto Zica de Almeida 07/09/2021


/*Fa�a um algoritmo que leia o ano de nascimento de uma pessoa e calcule sua idade, 
considerando o ano atual. Para verificar se j� fez anivers�rio no ano atual pergunte se a 
pessoa j� fez anivers�rio, sendo que ela pode entrar com a informa��o "S"(sim) ou "N" 
(n�o). Com isto � poss�vel se ter maior precis�o sobre a idade. Verifique tamb�m se a 
pessoa j� tem idade para conseguir Carteira de Habilita��o (18 anos ou mais) e imprima a 
mensagem referente a esta checagem. Imprima a idade da pessoa*/

import java.util.Scanner;

public class Exercicio3lista {

	public static void main(String[] args) 
	{
		//Declara��o de variaveis
		Scanner teclado = new Scanner(System.in);
		int anonasc,idade = 0, idade2 = 0;
		char op�ao;
		
		//Leitura
		System.out.println("Qual Seu ano de nascimento?");
		anonasc = teclado.nextInt();
		System.out.println("Voc� ja fez anivers�rio este ano?   Sim>>>S N�o>>>N   ");
		op�ao = teclado.next().charAt(0);
		
		// Calculo e exibi��o
		idade = (2021-anonasc);//Calculo da idade caso a pessoa tenha feito aniversario esse ano
		idade2 =((2021-anonasc)-1);//Calculo da idade caso a pesso nao tenha feito aniversario esse ano
		if (op�ao == 's' && idade < 18)
		{//Caso a Pessoa tenha feito aniversario esse ano e a idade seja inferior a 18 o programa exibir� a mensagem abaixo
		System.out.printf("Voc� nao tem idade para conseguir Carteira de habilita��o, Sua idade � %d\n",idade);
		}
		else if (op�ao =='n' && idade2 <18)
		{//Caso a Pessoa nao tenha feito aniversario esse ano e a idade seja inferior a 18 o programa exibir� a mensagem abaixo
		System.out.printf("Voc� nao tem idade para conseguir Carteira de habilita��o, Sua idade � %d\n",idade2);
		}	
		else if (op�ao =='s' && idade >=18)
		{//Caso a Pessoa tenha feito aniversario esse ano e a idade seja superior a 18 o programa exibir� a mensagem abaixo
		System.out.printf("Voc� tem idade para conseguir Carteira de habilita��o, Sua idade � %d\n",idade);
		}
		else//Caso a Pessoa nao tenha feito aniversario esse ano e a idade seja superior a 18 o programa exibir� a mensagem abaixo
		System.out.printf("Voc� tem idade para conseguir Carteira de habilita��o, Sua idade � %d\n",idade2);
			
		teclado.close();
	}

}
