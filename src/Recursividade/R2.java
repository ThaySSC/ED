package Recursividade;

public class R2 {

		public int mod (int divisor, int dividen) {
				 /* Fa�a uma fun��o recursiva que calcula o resto de uma divis�o
				  *  usando subtra��es sucessivas. int mod (int a, int b); */
						        
			        if (dividen < divisor){
						return dividen;
						
					} else {
						dividen = dividen - divisor;
	
					return mod (divisor, dividen);
					
				           }
	}

}

