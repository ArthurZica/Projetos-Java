import java.util.Scanner;
//Exercicio 2 3�lista de exercicios
/*A  prefeitura  de  uma  cidade  fez  uma  pesquisa  entre  os  seus  habitantes,  
 * coletando  dados sobre  o  sal�rio  e  n�mero  de  filhos. 
 *  Fa�a um procedimento que  leia  esses  dados  para  
 *  um n�mero  n�o  determinado  de  pessoas,  calcule  e  
 *  exiba a  m�dia  de  sal�rio  da  popula��o  
 *  (acondi��o de parada pode ser um flagou a quantidade N). 
 *  Fa�a um programa que acione o procedimento.*/
//Arthur Augusto Zica de Almeida

public class exercicio2lista3 {
	
	
	
	public static void recebedados() {
	Scanner entrada = new Scanner(System.in);
	
	double sal = 0,somasalario = 0,mediasal=0;
	int filhos,npessoas=0;
	//Leitura
	while (sal>=0) {//Enquanto o sal�rio for maior ou igual a 0 o sistema pede outro salario e numero de filhos
	System.out.println("Digite o sal�rio");
	sal = entrada.nextDouble();
	if (sal<0){//Quando o sal�rio � um numero negativo o programa para imediatamente e mostra os resultados
		break;
	}
	somasalario +=  sal;
	System.out.printf("O salario � %.2f\n", sal);
	System.out.println("Digite o numero de filhos");//Entrada do numero de filhos
	filhos = entrada.nextInt();
	npessoas++;//Soma mais um ao numero de pessoas
	}
	//Formulas
	mediasal = somasalario/npessoas;
	System.out.printf("A m�dia dos sal�rios �: %.2f\n", mediasal);

	
	
	
	entrada.close();
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	recebedados();//Chama o procedimento
	System.out.println("Fim do programa");
	}

}
