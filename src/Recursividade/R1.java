package Recursividade;


public class R1 {
		public int div (int divisor, int dividen) {
			
			int quoc = 0;
		
			if (dividen < divisor) {
				return 0;
				
			} else {
				dividen += dividen - divisor;
				
			return quoc += div (divisor, dividen);
			
			
			
			}
		}
}


