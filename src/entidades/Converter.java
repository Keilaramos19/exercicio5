package entidades;

public class Converter {
	public static double IOF = 0.06;
	public static double dolarParaReal(double quantia, double dolarPreco) {
	return quantia * dolarPreco * (1.0 + IOF);

	}
}

