package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entidades.Converter;
public class Programa {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Preço do dólar? ");
			double dolarPreco = sc.nextDouble();
			
			System.out.print("Quantos dólares serão comprados? ");
			double quantia = sc.nextDouble();
			
			double resultado = Converter.dolarParaReal(quantia, dolarPreco);
			System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
			sc.close();
	}

}





