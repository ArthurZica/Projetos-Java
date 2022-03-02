import java.util.Scanner;
//Exercicio 9 Lista
//Arthur Augusto Zica de Almeida
/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele 
comercializa. Para isto, mandou digitar uma linha para cada mercadoria com o preço de 
compra e de venda de cada uma. A última linha contém preço de compra igual a 0. Escreva 
um programa que:
a) Determine e escreva quantas mercadorias proporcionaram:
i) Lucro < 10%
ii) 10% <= lucro <= 20%
iii) Lucro > 20%
b) Determine e escreva o valor total de compra e de venda de todas as mercadorias,
assim como o lucro total*/
public class Exercicio9ista2 {

	public static void main(String[] args) 
	{
	//Declaração de variaveis
	Scanner teclado = new Scanner(System.in);
	int lucro10 = 0,lucro1020 = 0,lucro20 = 0;
	double preçocompra = 1,preçovenda,compratotal = 0,vendatotal = 0,lucro,lucrototal = 0,calclucro;
	
	while (preçocompra != 0) {//Enquanto preço de compra for diferente de 0 o codigo é executado
		System.out.println("Digite o preço de compra");
		preçocompra = teclado.nextDouble();
		if (preçocompra == 0) {/*Se for detectado que o preço de compra digitado foi 0 o codigo para imediatamente
		 						e exibe os resultados, fiz dessa forma para que o usuario nao
		 						 tenha que digitar algum valor para o preço de venda, quando o de compra for 0*/ 
			break;}
		System.out.println("Digite o preço de venda");
		preçovenda = teclado.nextDouble();
		//Formulas
		compratotal += preçocompra;//Compra total é a soma de todas as compras
		vendatotal += preçovenda;//Venda total é a soma de todas as vendas
		lucro = preçovenda-preçocompra;
		lucrototal += lucro;//Lucro total é a soma de todos os lucros
		calclucro = (lucro*preçovenda)/100;//Calculo de porcentagem do lucro
		//Condições
		if (calclucro < 10) {//Se a porcentagem for menor que 10% o programa conta mais um para os lucros menores que 10%
			lucro10++;}
		if(calclucro > 10 && calclucro < 20){//mesmo padrão do acima porém com maiores que 10% e menores que 20%
			lucro1020++;}
		if (calclucro>20){//mesmo padrão do acima, porém com maiores de 20%
			lucro20++;}
	}
	//Exibição
	System.out.printf("O total de mercadorias com o lucro menor que 10%% foi:  %d\n", lucro10);
	System.out.printf("O total de mercadorias com o lucro maior que 10%% e menor que 20%% foi: %d\n",lucro1020);
	System.out.printf("O total de mercadorias com o lucro maior que 20%% foi:  %d\n", lucro20);
	System.out.printf("O valor total de compra foi: %.2f\n", compratotal);
	System.out.printf("O valor total de venda foi: %.2f\n", vendatotal);
	System.out.printf("O valor total do lucro foi: %.2f\n", lucrototal);
	teclado.close();
	}

}
