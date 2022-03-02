import java.util.Scanner;
//Atividade 6 - Arthur Augusto Zica de Almeida
/* Faça um procedimento que receba e preencha um vetor com as notas de uma turma de 10 
alunos. Faça um outro procedimento que receba um vetor preenchido com as notas, calcule 
a média da turma e conte quantos alunos obtiveram nota acima da média. Esse 
procedimento  deve  exibir  a  média  e  o  resultado  da  contagem.  Faça  um  programa  que 
declare as devidas variáveis e acione os procedimentos. */
public class Exercicio6Lista4 {
	//procedimento que preenche os dados no vetor
	public static void preenchedados (double []notas) {
	Scanner teclado = new Scanner(System.in);
	for (int alunos=0;alunos<10;alunos++) {
		System.out.println("Digite a nota do "  +(alunos+1) +" º aluno");
		notas[alunos] = teclado.nextDouble();
	}		
	teclado.close();
	}
	//função que calcula a media
	public static double calcMed(double []notas){
	double soma = 0;
	for (int pos=0; pos<10; pos++) 
	{
		soma = soma+notas[pos];
	}
	double media = soma/10;//Formula
	return media;
	
	}
	//Função que verifica quantos alunos estão acima da media
	public static double acimadamedia(double []notas) {
	double media = calcMed(notas);
	int Pacima = 0;
	for (int pos=0;pos<10;pos++) {
	if(notas[pos]>media) {
	Pacima++;
	}	
	
	}
	return Pacima;
	}	
	//Procedimento que assiona o processamento dos dados
	public static void processadados (double []notas) {
	System.out.println("A media das notas é" +calcMed(notas));
	System.out.println("As notas acima da media sao" +acimadamedia(notas));
	
	}
	//Main
	public static void main(String[] args) {
	//Criação do vetor
	double notas[]	=  new double[10];
	preenchedados (notas);
	processadados (notas);
	
	
	System.out.println("Fim do programa");
	}

}
