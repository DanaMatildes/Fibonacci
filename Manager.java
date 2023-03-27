package fibonacciPackage;
import java.io.*;
import java.util.List;

public class Manager {
	
	public void ejecutarFibonacci(List<Integer> lista) throws IOException {
		String path = "C:\\Users\\52733\\OneDrive\\Documentos\\programación\\Fibonacci.txt";
		File file = new File(path);
		FileWriter miFileWriter = new FileWriter(file);
		PrintWriter miPrintWriter = new PrintWriter(miFileWriter);
		
		if (!file.exists()) {
			file.createNewFile();
			//miFileWriter = new FileWriter(file);
			//miPrintWriter = new PrintWriter(miFileWriter);
		}
		
		miPrintWriter.print("Serie Fibonacci: \n\n");
		for(int i=0; i<lista.size(); i++) {
			if(i==lista.size()-1) {
				miPrintWriter.print(lista.get(i)+ ". ");
			}else {
				miPrintWriter.print(lista.get(i)+ ", ");
			}	
		}
		miPrintWriter.close();
		
		if(file.exists()) {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String st = bufReader.readLine();
			System.out.print(st);
		}
	}
	
	public void ejecutarFibonacciPares(List<Integer> lista) throws IOException {
		String path = "C:\\Users\\52733\\OneDrive\\Documentos\\programación\\Fibonacci_Pares.txt";
		File file = new File(path);
		FileWriter miFileWriter = new FileWriter(file);
		PrintWriter miPrintWriter = new PrintWriter(miFileWriter);
		
		if (!file.exists()) {
			file.createNewFile();
			//miFileWriter = new FileWriter(file);
			//miPrintWriter = new PrintWriter(miFileWriter);
		}
		
		miPrintWriter.print("Números pares de la serie Fibonacci: \n\n");
		for(int i=0; i<lista.size(); i++) {
			if(i==lista.size()-1) {
				miPrintWriter.print(lista.get(i)+ ". ");
			}else {
				miPrintWriter.print(lista.get(i)+ ", ");
			}	
		}
		miPrintWriter.close();
		
		if(file.exists()) {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String st = bufReader.readLine();
			System.out.print(st);
		}
	}
	
	public void ejecutarFibonacciImpares(List<Integer> lista) throws IOException {
		String path = "C:\\Users\\52733\\OneDrive\\Documentos\\programación\\Fibonacci_Impares.txt";
		File file = new File(path);
		FileWriter miFileWriter = new FileWriter(file);
		PrintWriter miPrintWriter = new PrintWriter(miFileWriter);
		
		if (!file.exists()) {
			file.createNewFile();
			//miFileWriter = new FileWriter(file);
			//miPrintWriter = new PrintWriter(miFileWriter);
		}
		
		miPrintWriter.print("Números impares de la serie Fibonacci: \n\n");
		for(int i=0; i<lista.size(); i++) {
			if(i==lista.size()-1) {
				miPrintWriter.print(lista.get(i)+ ". ");
			}else {
				miPrintWriter.print(lista.get(i)+ ", ");
			}	
		}
		miPrintWriter.close();
		
		if(file.exists()) {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(fileReader);
			String st = bufReader.readLine();
			System.out.print(st);
		}
	}

}