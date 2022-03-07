package Revisao_Aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/* O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. Então o funcionamento deverá ser da seguinte forma: 
 * ler o valor da mercadoria e perguntar ‘MAIS MERCADORIAS (S/N)?’. 
   Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque */

public class Mercadorias_Estoque2 {

public static void main(String[] args) {
				
				Scanner in = new Scanner(System.in);
				int mercadorias = 0, pergunta = 1, cal = 1, i = 1;
				double valor_t = 0, m = 0;
				
				    
				    while (pergunta == 1) {
						
						 mercadorias = Integer.parseInt((JOptionPane.showInputDialog("Informe o valor da "+ i +"º mercadoria \n")));
						  valor_t = valor_t + 1;		
						
						 pergunta =   Integer.parseInt((JOptionPane.showInputDialog("Mais mercadorias? 1-S 2-N")));
							
					  mercadorias = mercadorias / cal;
					  cal++;
					  i++;
					  
					    return;
				    }
				        
				    	System.out.printf("Valor total em estoque "+valor_t+"\n");	
						System.out.printf("Média de valor das mercadorias "+mercadorias +"\n");
						
						
	} 

}