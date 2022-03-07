package Recursividade;

public class R2 {

		public int mod (int divisor, int dividen) {
				 /* Faça uma função recursiva que calcula o resto de uma divisão
				  *  usando subtrações sucessivas. int mod (int a, int b); */
						        
			        if (dividen < divisor){
						return dividen;
						
					} else {
						dividen = dividen - divisor;
	
					return mod (divisor, dividen);
					
				           }
	}

}

