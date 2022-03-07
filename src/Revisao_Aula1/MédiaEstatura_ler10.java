package Revisao_Aula1;

import java.util.Iterator;
import java.util.Scanner;

public class MédiaEstatura_ler10 {

	public static void main(String[] args) {
		// Receba um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
		//a. a maior e a menor altura do grupo;
		//b. média de altura dos homens;
		//c. o número de mulheres.

		int sex, saida_s = 0;
		float maior_a = 0, menor_a = 99, media = 0;
		int  mulheres, i;
		double alt1;
		Scanner in = new Scanner(System.in);
		
		double alt [] = new double [12];
		
			for (i=1; i<11; i++) {
				
			//Gênero do usuário 
			 System.out.printf("Informe o gênero do %d º usuário: sendo 1-Femin. 2-Masc. \n", i);
			 sex = Integer.parseInt(in.nextLine());
			 
			//Switch Case para somar a quantidade de mulheres
				
				switch (sex) {
					
				  case 1:	
					saida_s = saida_s + 1;
				  break;
				
				  case 2:
				  break;
				  
				}	
				
			}
		
			//Altura do usuário

			for (i=1; i<11; i++) {

			 System.out.printf("Informe a altura do %d º usuário: em m (1,65) \n", i);
			 alt1 = (in.nextDouble());
			 alt[i] = alt1;
			 
			}
			
			for (int j = 0; j < alt.length; j++) {
				if (alt[j] < 99) {
					menor_a = (float) alt[j];
				}
			}
			
			for (int j = 0; j < alt.length; j++) {
				
				media += alt[j];
				
				if (alt[j] < menor_a) {
					menor_a = (float) alt[j];
				}
				
				if (alt[j] > maior_a) {
					maior_a = (float) alt[j];
				}
			
			}		
			media = media / 10;
				System.out.print("A quantidade de mulheres são: "+ saida_s+"\n"); 
				System.out.print("A média de altura dos homens: "+ media+"\n"); 
				System.out.print("Menor altura: "+ menor_a+"\n"); 
				System.out.print("Maior altura:"+ maior_a+"\n"); 
	}
		
}	