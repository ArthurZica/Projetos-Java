import java.util.Scanner;
//Exercicio 10 da 3º lista 
/*Faça uma função que recebe a idade de um nadador por parâmetro e retorna a categoria
desse nadador de acordo com a tabela abaixo.
Idade (anos) Categoria
5 a 7 F
8 a 10 E
11 a 13 D
14 a 15 C
16 a 17 B
Acima de 18 A
Faça um programa que lê a idade de um nadador e imprime a categoria retornada pela
função.*/
//Arthur Augusto Zica de Almeida
public class exercicio10lista3 {
	//Função
	public static char categoria(int idade) {
	//Variavel
	char cat;
	if (idade >4 && idade <= 7) {//Todos os casos demonstrados no enunciado
	return cat ='F';//Retorno da categoria
	}
	else if (idade >8 && idade <= 10)  {
	return cat ='E';
	}
	else if (idade >10 && idade <= 13)  {
	return cat ='D';
	}
	else if (idade >13 && idade <= 15) {
	return cat ='C';
	}
	else if (idade >15 && idade <= 17)  {
	return cat ='B';
	}
	else if (idade>=18)  {
	return cat ='A';
	}
	else
	return cat = 'X';//Coloquei esta categoria para o programa conseguir rodar
	}
	//Main
	public static void main(String[] args) {
	//Variaveis
	int idade = 0;
	//Leitura
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a idade do nadador");
	idade = teclado.nextInt();
	//Mensagem de erro caso a idade seja invalida
	if (idade<5) {
	System.out.println("Erro");	
	}
	//Caso seja valida o programa chama a função
	else {
	categoria(idade);
	System.out.println("A categoria é:"+categoria(idade));
	}
	teclado.close();
	}

}
