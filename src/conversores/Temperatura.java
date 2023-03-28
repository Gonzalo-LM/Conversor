package conversores;

import java.text.DecimalFormat;

public class Temperatura {
	
	private String temperatura;
	private double conversor;
	private DecimalFormat df = new DecimalFormat("#.00");
	
	public Temperatura(String medida) {
		this.temperatura = temperatura;
	}
	
	//C° a F° y K°
	
	public double convertirC_F(double valor) {
		conversor = valor * 1.8 + 32;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirC_K(double valor) {
		conversor = valor + 273.15;
		return Double.parseDouble(df.format(conversor));
	}
	
	//F° a C° y K°
	
	public double convertirF_C(double valor) {
		conversor = (valor - 32) / 1.8;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirF_K(double valor) {
		conversor = (valor - 32) * 5 / 9 + 273.15;
		return Double.parseDouble(df.format(conversor));
	}
	
	//K° a C° y F°
	
	public double convertirK_C(double valor) {
		conversor = valor - 273.15;
		return Double.parseDouble(df.format(conversor));
	}
	
	public double convertirK_F(double valor) {
		conversor = 1.8 * (valor - 273.15) + 32;
		return Double.parseDouble(df.format(conversor));
	}

}
