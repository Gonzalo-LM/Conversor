package conversores;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	
	private Object[] monedas = {"Sol", "Dolar", "Euro", "LibraE", "Yen", "Won"};
	private String valor;
	private String tipo;
	private String tipo2;
	private Monedas moneda = new Monedas(tipo);
	
	public void iniciar() {
		
		valor = JOptionPane.showInputDialog("Ingresa monto a convertir");

		Object selectedValue = JOptionPane.showInputDialog(null, "De", "Conversor de monedas", JOptionPane.INFORMATION_MESSAGE, null, monedas, monedas);
		
		tipo = selectedValue.toString();
		
		conversor();
	}
	
	public void conversor() {
		if(tipo == "Sol") {
			Object selectedValue2 = JOptionPane.showInputDialog(null, "A", "Conversor de monedas", JOptionPane.INFORMATION_MESSAGE, null, monedas, monedas);
			tipo2 = selectedValue2.toString();
			
			if(tipo2 == "Sol") {
				JOptionPane.showMessageDialog(null, "El valor en Soles es: S/" + valor);
			}else if(tipo2 == "Dolar") {
				JOptionPane.showMessageDialog(null, "El valor en Dolar es: $" + moneda.convertirSolDolar(Double.parseDouble(valor)));
			}else if(tipo2 == "Euro") {
				JOptionPane.showMessageDialog(null, "El valor en Euro es: €" + moneda.convertirSolEuro(Double.parseDouble(valor)));
			}else if(tipo2 == "LibraE") {
				JOptionPane.showMessageDialog(null, "El valor en Libras Esterlinas es: £" + moneda.convertirSolLibraEsterlina(Double.parseDouble(valor)));
			}else if(tipo2 == "Yen") {
				JOptionPane.showMessageDialog(null, "El valor en Yen es: ¥" + moneda.convertirSolYenJ(Double.parseDouble(valor)));
			}else if(tipo2 == "Won") {
				JOptionPane.showMessageDialog(null, "El valor en Won es: W" + moneda.convertirSolWonSC(Double.parseDouble(valor)));
			}
		}
		if(tipo == "Dolar") {
			JOptionPane.showMessageDialog(null, "El valor en Soles es: S/" + moneda.convertirDolarSol(Double.parseDouble(valor)));
		}else if(tipo == "Euro") {
			JOptionPane.showMessageDialog(null, "El valor en Soles es: S/" + moneda.convertirEuroSol(Double.parseDouble(valor)));
		}else if(tipo == "LibraE") {
			JOptionPane.showMessageDialog(null, "El valor en Soles es: S/" + moneda.convertirLibraEsterlinaSol(Double.parseDouble(valor)));
		}else if(tipo == "Yen") {
			JOptionPane.showMessageDialog(null, "El valor en Soles es: S/" + moneda.convertirYenJSol(Double.parseDouble(valor)));
		}else if(tipo == "Won") {
			JOptionPane.showMessageDialog(null, "El valor en Soles es: S/" + moneda.convertirWonSCSol(Double.parseDouble(valor)));
		}
	}
	
}
