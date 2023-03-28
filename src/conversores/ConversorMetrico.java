package conversores;

import javax.swing.JOptionPane;

public class ConversorMetrico {
	
	private Object[] medidas = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
	private String valor;
	private String tipo;
	private String tipo2;
	private Metrico medida = new Metrico(tipo);
	
	public void iniciar() {
		
		valor = JOptionPane.showInputDialog("Ingresa medida a convertir");

		Object selectedValue = JOptionPane.showInputDialog(null, "De", "Conversor metrico", JOptionPane.INFORMATION_MESSAGE, null, medidas, medidas);
		
		tipo = selectedValue.toString();
		
		conversor();
	}
	
	public void conversor() {
		if(tipo == "m") {
			Object selectedValue2 = JOptionPane.showInputDialog(null, "A", "Conversor metrico", JOptionPane.INFORMATION_MESSAGE, null, medidas, medidas);
			tipo2 = selectedValue2.toString(); 
			
			if(tipo2 == "m") {
				JOptionPane.showMessageDialog(null, "El valor en metros es: " + valor + "m");
			}else if(tipo2 == "km") {
				JOptionPane.showMessageDialog(null, "El valor en kilometros es: " + medida.convertirMetroKm(Double.parseDouble(valor)) + "km");
			}else if(tipo2 == "hm") {
				JOptionPane.showMessageDialog(null, "El valor en hectometros es: " + medida.convertirMetroHm(Double.parseDouble(valor)) + "hm");
			}else if(tipo2 == "dam") {
				JOptionPane.showMessageDialog(null, "El valor en decametros es: " + medida.convertirMetroDam(Double.parseDouble(valor)) + "dam");
			}else if(tipo2 == "dm") {
				JOptionPane.showMessageDialog(null, "El valor en decimetros es: " + medida.convertirMetroDm(Double.parseDouble(valor)) + "dm");
			}else if(tipo2 == "cm") {
				JOptionPane.showMessageDialog(null, "El valor en centimetros es: " + medida.convertirMetroCm(Double.parseDouble(valor)) + "cm");
			}else if(tipo2 == "mm") {
				JOptionPane.showMessageDialog(null, "El valor en milimetros es: " + medida.convertirMetroMm(Double.parseDouble(valor)) + "mm");
			}
		}
		else if(tipo == "km") {
			JOptionPane.showMessageDialog(null, "El valor en metros es: " + medida.convertirKmMetro(Double.parseDouble(valor)) + "m");
		}else if(tipo == "hm") {
			JOptionPane.showMessageDialog(null, "El valor en metros es: " + medida.convertirHmMetro(Double.parseDouble(valor)) + "m");
		}else if(tipo == "dam") {
			JOptionPane.showMessageDialog(null, "El valor en metros es: " + medida.convertirDamMetro(Double.parseDouble(valor)) + "m");
		}else if(tipo == "dm") {
			JOptionPane.showMessageDialog(null, "El valor en metros es: " + medida.convertirDmMetro(Double.parseDouble(valor)) + "m");
		}else if(tipo == "cm") {
			JOptionPane.showMessageDialog(null, "El valor en metros es: " + medida.convertirCmMetro(Double.parseDouble(valor)) + "m");
		}else if(tipo == "mm") {
			JOptionPane.showMessageDialog(null, "El valor en metros es: " + medida.convertirMmMetro(Double.parseDouble(valor)) + "m");
		}
	}
	
}
