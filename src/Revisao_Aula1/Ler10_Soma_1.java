package Revisao_Aula1;

import javax.swing.JOptionPane;

public class Ler10_Soma_1 {
	public static void main(String[] args) {
		//Escreva um algoritmo para ler 10 n�meros. Todos os n�meros lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.
	
		int cont = 1, val = 0, soma = 0;
		
		do {
		
			val = Integer.parseInt((JOptionPane.showInputDialog("Digite o "+ cont +"� n�mero")));
			cont++;
			
			if (val < 40) {
				soma = soma + val;		
			}
			
		} while (cont<=10);
		
		JOptionPane.showMessageDialog(null, "Soma dos n�meros menores que 40: \n"+soma);
	
	}
	
}
