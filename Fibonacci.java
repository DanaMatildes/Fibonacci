package fibonacciPackage;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	List<Integer> hacerSerie () {
		
		List<Integer> serieFibonacci = new ArrayList<Integer>();
		
		serieFibonacci.add(1);
		serieFibonacci.add(1);

		for(int i=2; i<31; i++) {
			int j = serieFibonacci.get(i-2);
			int k = serieFibonacci.get(i-1);
			
			serieFibonacci.add(j+k);
			
		}
		
		return(serieFibonacci);
	}	
}