import java.util.Scanner;

public class Exercicio7lista4 {

	public static void preenchevetor(double []valores) {
	Scanner teclado = new Scanner(System.in);
	for (int pos=0;pos<10;pos++) {
	System.out.println("Digite o valor " +(pos+1));
	valores[pos] = teclado.nextDouble();
	}	
	teclado.close();
	}
	public static double processarvetor(double []valores) {
	for (int pos=0;pos<10;pos++) {
	if (valores[pos]<0)
	{
	
	double negativos[] = new double[pos];
	
	}	
	return valores;
	}	
		
		
	}
	
	public static void main(String[] args) {
	double valores[] = new double[10];
	preenchevetor(valores);
	processarvetor(valores);
	}

}
