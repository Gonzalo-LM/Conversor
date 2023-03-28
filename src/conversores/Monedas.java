package conversores;

import java.text.DecimalFormat;

public class Monedas {
	
	private String moneda;
	private double conversor;
	private DecimalFormat df = new DecimalFormat("#.00");
	
	public Monedas(String moneda) {
		this.moneda = moneda;
	}
	
	//Sol a otra moneda
	
	public double convertirSolDolar(double valor) {
		conversor = valor * 0.27;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirSolEuro(double valor) {
		conversor = valor * 0.25;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirSolLibraEsterlina(double valor) {
		conversor = valor * 0.22;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirSolYenJ(double valor) {
		conversor = valor * 34.68;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirSolWonSC(double valor) {
		conversor = valor * 344.69;
		return Double.parseDouble(df.format(conversor));
	}
	
	//Otra moneda a Sol
	
	public double convertirDolarSol(double valor) {
		conversor = valor * 3.77;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirEuroSol(double valor) {
		conversor = valor * 4.06;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirLibraEsterlinaSol(double valor) {
		conversor = valor * 4.61;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirYenJSol(double valor) {
		conversor = valor * 0.029;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirWonSCSol(double valor) {
		conversor = valor * 0.0029;
		return Double.parseDouble(df.format(conversor));
	}

}
