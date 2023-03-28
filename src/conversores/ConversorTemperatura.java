package conversores;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	private Object[] escalas = {"Celsius", "Fahrenheit", "Kelvin"};
	private String valor;
	private String tipo;
	private String tipo2;
	private Temperatura escala = new Temperatura(tipo);
	
	public void iniciar() {
		
		valor = JOptionPane.showInputDialog("Ingresa grados a convertir");

		Object selectedValue = JOptionPane.showInputDialog(null, "De", "Conversor de temperatura", JOptionPane.INFORMATION_MESSAGE, null, escalas, escalas);
		
		tipo = selectedValue.toString();
		
		conversor();
	}
	
	public void conversor() {
		if(tipo == "Celsius") {
			Object selectedValue2 = JOptionPane.showInputDialog(null, "A", "Conversor de temperatura", JOptionPane.INFORMATION_MESSAGE, null, escalas, escalas);
			tipo2 = selectedValue2.toString();
			
			if(tipo2 == "Celsius") {
				JOptionPane.showMessageDialog(null, "El valor en Celsius es: " + valor);
			}else if(tipo2 == "Fahrenheit") {
				JOptionPane.showMessageDialog(null, "El valor en Fahrenheit es: " + escala.convertirC_F(Double.parseDouble(valor)));
			}else if(tipo2 == "Kelvin") {
				JOptionPane.showMessageDialog(null, "El valor en Kelvin es: " + escala.convertirC_K(Double.parseDouble(valor)));
			}
		}
		if(tipo == "Fahrenheit") {
			Object selectedValue2 = JOptionPane.showInputDialog(null, "A", "Conversor de temperatura", JOptionPane.INFORMATION_MESSAGE, null, escalas, escalas);
			tipo2 = selectedValue2.toString();
			
			if(tipo2 == "Celsius") {
				JOptionPane.showMessageDialog(null, "El valor en Celsius es: " + escala.convertirF_C(Double.parseDouble(valor)));
			}else if(tipo2 == "Fahrenheit") {
				JOptionPane.showMessageDialog(null, "El valor en Fahrenheit es: " + valor);
			}else if(tipo2 == "Kelvin") {
				JOptionPane.showMessageDialog(null, "El valor en Kelvin es: " + escala.convertirF_K(Double.parseDouble(valor)));
			}
		}
		if(tipo == "Kelvin") {
			Object selectedValue2 = JOptionPane.showInputDialog(null, "A", "Conversor de temperatura", JOptionPane.INFORMATION_MESSAGE, null, escalas, escalas);
			tipo2 = selectedValue2.toString();
			
			if(tipo2 == "Celsius") {
				JOptionPane.showMessageDialog(null, "El valor en Celsius es: " + escala.convertirK_C(Double.parseDouble(valor)));
			}else if(tipo2 == "Fahrenheit") {
				JOptionPane.showMessageDialog(null, "El valor en Fahrenheit es: " + escala.convertirK_F(Double.parseDouble(valor)));
			}else if(tipo2 == "Kelvin") {
				JOptionPane.showMessageDialog(null, "El valor en Kelvin es: " + valor);
			}
		}
	}
	
}
