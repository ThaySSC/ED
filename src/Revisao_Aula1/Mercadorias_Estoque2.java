package Revisao_Aula1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/* O mesmo exerc�cio anterior, mas agora n�o ser� informado o n�mero de mercadorias em estoque. Ent�o o funcionamento dever� ser da seguinte forma: 
 * ler o valor da mercadoria e perguntar �MAIS MERCADORIAS (S/N)?�. 
   Ao final, imprimir o valor total em estoque e a m�dia de valor das mercadorias em estoque */

public class Mercadorias_Estoque2 {

public static void main(String[] args) {
				
				Scanner in = new Scanner(System.in);
				int mercadorias = 0, pergunta = 1, cal = 1, i = 1;
				double valor_t = 0, m = 0;
				
				    
				    while (pergunta == 1) {
						
						 mercadorias = Integer.parseInt((JOptionPane.showInputDialog("Informe o valor da "+ i +"� mercadoria \n")));
						  valor_t = valor_t + 1;		
						
						 pergunta =   Integer.parseInt((JOptionPane.showInputDialog("Mais mercadorias? 1-S 2-N")));
							
					  mercadorias = mercadorias / cal;
					  cal++;
					  i++;
					  
					    return;
				    }
				        
				    	System.out.printf("Valor total em estoque "+valor_t+"\n");	
						System.out.printf("M�dia de valor das mercadorias "+mercadorias +"\n");
						
						
	} 

}