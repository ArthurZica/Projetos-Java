import java.util.Scanner;
//Arthur Augusto Zica de Almeida
//Exercicio 5
/*A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o 
sal�rio e n�mero de filhos de cada habitante. A prefeitura deseja saber: 
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00. 
O final da leitura de dados se dar� com a entrada de um sal�rio negativo */
public class Exercicio5lista2 {

	public static void main(String[] args) 
	{
	//Declara��o de variaveis
	Scanner teclado = new Scanner(System.in);
	double sal = 0,somasalario = 0,mediasal=0,maiorsal=0,mediafilhos;
	int filhos,npessoas=0,cont100=0,nfilhos = 0;
	//Leitura
	while (sal>=0) {//Enquanto o sal�rio for maior ou igual a 0 o sistema pede outro salario e numero de filhos
	System.out.println("Digite o sal�rio");
	sal = teclado.nextDouble();
	if (sal<0){//Quando o sal�rio � um numero negativo o programa para imediatamente e mostra os resultados
		break;
	}
	somasalario +=  sal;
	if(sal<=100)//Se o salario for menor ou igual a 100 a contagem de salarios ate 100 soma um.
	{
	cont100++;		
	}
	if(sal>maiorsal) {//Se o programa detectar um salario maior que os anteriores o novo salario sera o maior salario
	maiorsal=sal;	
	}	
	
	System.out.printf("O salario � %.2f\n", sal);
	System.out.println("Digite o numero de filhos");//Entrada do numero de filhos
	filhos = teclado.nextInt();
	nfilhos += filhos;//O nfilhos � igual filhos
	npessoas++;//Soma mais um ao numero de pessoas
	}
	//Formulas
	mediasal = somasalario/npessoas;
	mediafilhos = nfilhos/npessoas;
	double pct100 = ((cont100*100)/npessoas);
	//Exibi��o
	
	System.out.printf("A m�dia do sal�rio �: %.2f\n", mediasal);
	System.out.printf("A m�dia do numero de filhos �: %.2f\n", mediafilhos);
	System.out.printf("O maior sal�rio �:%.2f\n", maiorsal);
	System.out.printf("O percentual de pessoas com salario ate 100: %.2f%% \n", pct100);
	
	
	teclado.close();
		
	}

}
