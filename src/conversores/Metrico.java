package conversores;

import java.text.DecimalFormat;

public class Metrico {
	
	private String medida;
	private double conversor;
	private DecimalFormat df = new DecimalFormat("#.00");
	
	public Metrico(String medida) {
		this.medida = medida;
	}
	
	//metro a otra medida
	
	public double convertirMetroKm(double valor) {
		conversor = valor * 0.001;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirMetroHm(double valor) {
		conversor = valor * 0.001;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirMetroDam(double valor) {
		conversor = valor * 0.01;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirMetroDm(double valor) {
		conversor = valor * 10;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirMetroCm(double valor) {
		conversor = valor * 100;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirMetroMm(double valor) {
		conversor = valor * 1000;
		return Double.parseDouble(df.format(conversor));
	}
	
	//Otra medida a metro
	
	public double convertirKmMetro(double valor) {
		conversor = valor * 1000;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirHmMetro(double valor) {
		conversor = valor * 100;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirDamMetro(double valor) {
		conversor = valor * 10;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirDmMetro(double valor) {
		conversor = valor * 0.1;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirCmMetro(double valor) {
		conversor = valor * 0.01;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirMmMetro(double valor) {
		conversor = valor * 0.001;
		return Double.parseDouble(df.format(conversor));
	}

}
