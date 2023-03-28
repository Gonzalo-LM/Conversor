package conversores;

import javax.swing.JOptionPane;

public class Conversores {
	
	private ConversorMoneda CM = new ConversorMoneda();
	private ConversorMetrico CME = new ConversorMetrico();
	private ConversorTemperatura CT = new ConversorTemperatura();
	private Object[] tipoConversores = {"moneda", "metrico", "temperatura"};
	private String tipo;
	private Integer continuar;
	
	public void iniciar() {

		Object selectedValue = JOptionPane.showInputDialog(null, "De", "Conversor", JOptionPane.INFORMATION_MESSAGE, null, tipoConversores, tipoConversores);
		
		String tipo = selectedValue.toString();
		
		if(tipo == "moneda") {
			CM.iniciar();
		}else if(tipo == "metrico") {
			CME.iniciar();
		}else if(tipo == "temperatura") {
			CT.iniciar();
		}
		
		continuarPrograma();
	}
	
	public void continuarPrograma() {
		continuar = JOptionPane.showConfirmDialog(null, "Desea continuar?");
		
		if(continuar == 0) {
			iniciar();
		}else if(continuar == 1){
			JOptionPane.showMessageDialog(null, "programa finalizado");
		}else if(continuar == 2){
			JOptionPane.showMessageDialog(null, "programa cancelado");
		}
	}
	
}
