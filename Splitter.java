package fibonacciPackage;
import java.util.ArrayList;
import java.util.List;

public class Splitter {
	
	Fibonacci fibonacci = new Fibonacci();
	List<Integer> serieFibonacci = fibonacci.hacerSerie();

	
	List<Integer> fibonacciPares(){
		
		List<Integer> fibonacciPares = new ArrayList<Integer>();
	
		for(int i=0; i<serieFibonacci.size(); i++) {
			int j = serieFibonacci.get(i);
			
			if(j%2 == 0) {
				fibonacciPares.add(serieFibonacci.get(i));
			}
		}
		return(fibonacciPares);
	}
	
	
	
	List<Integer> fibonacciImpares(){
		
		List<Integer> fibonacciImpares = new ArrayList<Integer>();
	
		for(int i=0; i<serieFibonacci.size(); i++) {
			int j = serieFibonacci.get(i);
			
			if(!(j%2 == 0)) {
				fibonacciImpares.add(serieFibonacci.get(i));
			}
		}
		return(fibonacciImpares);
	}

}