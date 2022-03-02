//Atividade 3 Lista de Exercicios
//Arthur Augusto Zica de Almeida 07/09/2021


/*Faça um algoritmo que leia o ano de nascimento de uma pessoa e calcule sua idade, 
considerando o ano atual. Para verificar se já fez aniversário no ano atual pergunte se a 
pessoa já fez aniversário, sendo que ela pode entrar com a informação "S"(sim) ou "N" 
(não). Com isto é possível se ter maior precisão sobre a idade. Verifique também se a 
pessoa já tem idade para conseguir Carteira de Habilitação (18 anos ou mais) e imprima a 
mensagem referente a esta checagem. Imprima a idade da pessoa*/

import java.util.Scanner;

public class Exercicio3lista {

	public static void main(String[] args) 
	{
		//Declaração de variaveis
		Scanner teclado = new Scanner(System.in);
		int anonasc,idade = 0, idade2 = 0;
		char opçao;
		
		//Leitura
		System.out.println("Qual Seu ano de nascimento?");
		anonasc = teclado.nextInt();
		System.out.println("Você ja fez aniversário este ano?   Sim>>>S Não>>>N   ");
		opçao = teclado.next().charAt(0);
		
		// Calculo e exibição
		idade = (2021-anonasc);//Calculo da idade caso a pessoa tenha feito aniversario esse ano
		idade2 =((2021-anonasc)-1);//Calculo da idade caso a pesso nao tenha feito aniversario esse ano
		if (opçao == 's' && idade < 18)
		{//Caso a Pessoa tenha feito aniversario esse ano e a idade seja inferior a 18 o programa exibirá a mensagem abaixo
		System.out.printf("Você nao tem idade para conseguir Carteira de habilitação, Sua idade é %d\n",idade);
		}
		else if (opçao =='n' && idade2 <18)
		{//Caso a Pessoa nao tenha feito aniversario esse ano e a idade seja inferior a 18 o programa exibirá a mensagem abaixo
		System.out.printf("Você nao tem idade para conseguir Carteira de habilitação, Sua idade é %d\n",idade2);
		}	
		else if (opçao =='s' && idade >=18)
		{//Caso a Pessoa tenha feito aniversario esse ano e a idade seja superior a 18 o programa exibirá a mensagem abaixo
		System.out.printf("Você tem idade para conseguir Carteira de habilitação, Sua idade é %d\n",idade);
		}
		else//Caso a Pessoa nao tenha feito aniversario esse ano e a idade seja superior a 18 o programa exibirá a mensagem abaixo
		System.out.printf("Você tem idade para conseguir Carteira de habilitação, Sua idade é %d\n",idade2);
			
		teclado.close();
	}

}
