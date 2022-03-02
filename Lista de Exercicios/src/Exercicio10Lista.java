import java.util.Scanner;
// Exercicio 10 Lista
// Arthur Augusto Zica de Almeida 09/09/2021 
/*Leia a velocidade m�xima permitida em uma avenida e a velocidade com que o motorista 
estava dirigindo nela. Se o motorista estiver dentro do limite de velocidade, imprima a 
mensagem �Motorista respeitou a lei�. Se o motorista tiver ultrapassado a velocidade 
m�xima permitida, calcule e imprima o valor da multa a ser cobrada, sabendo que os 
valores a serem cobrados s�o os seguintes:
� 50 reais se o motorista ultrapassar em at� 10km/h a velocidade permitida (ex: se a 
velocidade m�xima for 50km/h e o motorista estiver a 60km/h ou a 56km/h);
� 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida;
� 200 reais, se estiver acima de 30km/h da velocidade permitida*/
public class Exercicio10Lista {

	public static void main(String[] args)
	{
	//Declara��o de variaveis
	Scanner teclado = new Scanner(System.in);
	double velCARRO = 0,velLEI = 0,conta;
	
	//Leitura
	System.out.println("Digite a velocidade permitida da via");
	velLEI = teclado.nextDouble();
	System.out.println("Digite a velocidade do veiculo");
	velCARRO = teclado.nextDouble();
	//Calculo e exibi��o
	conta = (velCARRO - velLEI);//calculo de quanto ele passou da velocidade permitida
	if (conta >=1 && conta <= 10)// se o motorista ultrapassar em at� 10km/h a velocidade permitida
	{
	System.out.println("O motorista desrespeitou a lei o valor da multa � de 50 Reais");
	}
	else if (conta > 10 && conta <= 30)//se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida
	{
	System.out.println("O motorista desrespeitou a lei o valor da multa � de 100 Reais");
	}	
	else if (conta > 30)//se estiver acima de 30km/h da velocidade permitida
	{
	System.out.println("O motorista esrespeitou a lei o valor da multa � de 200 Reais ");
	}
	else if (conta <=  0)//Se estiver abaixo ou exatamente na velocidade permitida
	{
	System.out.println("O motorista respeitou a lei");
	}
	teclado.close();
	}

}
