package Revisao_Aula1;

import java.util.Scanner;

public class Mercadorias_Estoque {

	public static void main(String[] args) {
		/* Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada das seguintes informações: 
		a) o número total de mercadorias no estoque; 
		b) o valor de cada mercadoria. 
		Ao final imprimir o valor total em estoque e a média de valor das mercadorias*/
		
		Scanner in = new Scanner(System.in);
		int mercadorias = 0, cont = 1, i = 1;
		double valor_m, media_m, valor_t = 0, merc = 0;
		
		 System.out.printf("Informe a quantidade de mercadorias no estoque \n");
		 mercadorias = Integer.parseInt(in.nextLine());
		 
		
		do {
		
			System.out.printf("Informe o valor da %d º mercadoria \n", i);	
			valor_m = (in.nextDouble());
		    valor_t = valor_t + valor_m;
			i++;

			cont++;
		} while (cont <= mercadorias);
            merc = mercadorias;
			valor_m = valor_m /merc;
			
		System.out.printf("Valor total em estoque "+valor_t+"\n");	
		System.out.printf("Média de valor das mercadorias "+ valor_m+"\n");	
		
	}

}
