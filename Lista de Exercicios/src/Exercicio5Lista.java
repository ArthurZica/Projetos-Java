import java.util.Scanner;
//Arthur Augusto Zica de Almeida 08/09/2021
//Exercicio 5 Lista de atividades

/*Um hotel com 75 apartamentos deseja fazer uma promo��o especial de final de semana, 
concedendo um desconto de 25% na di�ria. Com isto, espera aumentar sua taxa de 
ocupa��o de 50 para 80%. Sendo dado o valor normal da di�ria, calcular e imprimir: 
a) o valor da di�ria promocional; 
b) o valor total arrecadado com 80% de ocupa��o e di�ria promocional; 
c) o valor total arrecadado com 50% de ocupa��o e di�ria normal; 
d) a diferen�a entre estes dois valores.*/

public class Exercicio5Lista {

	public static void main(String[] args) 
	{
	// Declara��o de variaveis
	Scanner teclado =  new Scanner(System.in);	
	double valDIA,valPROMO,valTPROMO,valTDIA;
	//Leitura 
	System.out.println("Digite o Valor normal da di�ria");
	valDIA = teclado.nextDouble();
	//Calculo e Exibi��o
	valPROMO = valDIA -(25 *valDIA/100 );//formula do calculo do valor da promo��o
	valTPROMO = (valPROMO * 60);//formula do calculo do valor arrecadado em promo��o
	valTDIA = (valDIA * 37.5);//formula do calculo do valor arrecadado sem promo��ao
	System.out.printf("O valor da Diaria promocional � %.2f\n", valPROMO);
	System.out.printf("O valor total arrecadado com a promo��o seria %.2f\n",valTPROMO);
	System.out.printf("O Valor total arrecadado sem promo��o seria %.2f\n",valTDIA);
	System.out.printf("A diferen�a do total arrecadado seria %.2f\n", valTPROMO-valTDIA);
	teclado.close();

	}

}
