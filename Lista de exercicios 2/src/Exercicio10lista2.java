import java.util.Scanner;
//Exercicio 10 Lista
//Arthur Augusto Zica de Almeida
/* */
public class Exercicio10lista2 {

	public static void main(String[] args) 
	{
	//Declaração de variaveis
	Scanner teclado = new Scanner(System.in);
	int voto = 1,c1 = 0,c2 = 0,c3 = 0,c4 = 0,nulo = 0,branco = 0;
	//Leitura
	while(voto != 0) {
	System.out.println("Insira o numero do candidado desejado 1-4 ou 5 para votar em nulo e 6 para votar em branco");
	voto = teclado.nextInt();
	//Codições
	if (voto == 1) {//Se o valor digitado for um o voto é no candidato 1 
	c1++;
	}
	if (voto == 2) {//Se  o valor digitado for 2 o voto é no candidato 2
		c2++;
		}
	if (voto == 3) {//Se  o valor digitado for 3 o voto é no candidato 3
		c3++;
		}
	if (voto == 4) {//Se  o valor digitado for 4 o voto é no candidato 4
		c4++;
		}
	if (voto == 5) {//Se  o valor digitado for 5 o voto é no nulo
		nulo++;
		}
	if (voto == 6) {//Se  o valor digitado for 6 o voto é no branco
		branco++;
		}
	}
	System.out.printf("O numero de votos do candidato 1 foi %d\n", c1);
	System.out.printf("O numero de votos do candidato 2 foi %d\n", c2);
	System.out.printf("O numero de votos do candidato 3 foi %d\n", c3);
	System.out.printf("O numero de votos do candidato 4 foi %d\n", c4);
	System.out.printf("O numero de votos nulos foram %d\n", nulo);
	System.out.printf("O numero de votos brancos foram %d\n", branco);
	
	teclado.close();
	}

}
