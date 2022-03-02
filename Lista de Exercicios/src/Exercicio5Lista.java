import java.util.Scanner;
//Arthur Augusto Zica de Almeida 08/09/2021
//Exercicio 5 Lista de atividades

/*Um hotel com 75 apartamentos deseja fazer uma promoção especial de final de semana, 
concedendo um desconto de 25% na diária. Com isto, espera aumentar sua taxa de 
ocupação de 50 para 80%. Sendo dado o valor normal da diária, calcular e imprimir: 
a) o valor da diária promocional; 
b) o valor total arrecadado com 80% de ocupação e diária promocional; 
c) o valor total arrecadado com 50% de ocupação e diária normal; 
d) a diferença entre estes dois valores.*/

public class Exercicio5Lista {

	public static void main(String[] args) 
	{
	// Declaração de variaveis
	Scanner teclado =  new Scanner(System.in);	
	double valDIA,valPROMO,valTPROMO,valTDIA;
	//Leitura 
	System.out.println("Digite o Valor normal da diária");
	valDIA = teclado.nextDouble();
	//Calculo e Exibição
	valPROMO = valDIA -(25 *valDIA/100 );//formula do calculo do valor da promoção
	valTPROMO = (valPROMO * 60);//formula do calculo do valor arrecadado em promoção
	valTDIA = (valDIA * 37.5);//formula do calculo do valor arrecadado sem promoçãao
	System.out.printf("O valor da Diaria promocional é %.2f\n", valPROMO);
	System.out.printf("O valor total arrecadado com a promoção seria %.2f\n",valTPROMO);
	System.out.printf("O Valor total arrecadado sem promoção seria %.2f\n",valTDIA);
	System.out.printf("A diferença do total arrecadado seria %.2f\n", valTPROMO-valTDIA);
	teclado.close();

	}

}
