package fibonacciPackage;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		Splitter splitter = new Splitter();
		Manager manager = new Manager();
		
		try {
			manager.ejecutarFibonacci(fibonacci.hacerSerie());
			manager.ejecutarFibonacciPares(splitter.fibonacciPares());
			manager.ejecutarFibonacciImpares(splitter.fibonacciImpares());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
