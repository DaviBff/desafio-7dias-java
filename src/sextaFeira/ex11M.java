package sextaFeira;

import javax.swing.JOptionPane;

public class ex11M {

	public static void main(String[] args) {
		Double vet[] = new Double[1];
		Double vet2[] = new Double[1];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Double.valueOf(JOptionPane.showInputDialog("Insira um valor: "));
			vet2[i] = Double.valueOf(JOptionPane.showInputDialog("Insira outro valor: "));

		}

		String opera = JOptionPane.showInputDialog("Insira o operador: ");

		JOptionPane.showMessageDialog(null, "Resultado = " + (operacao(vet, vet2, opera)));

	}

	private static double operacao(Double[] vet, Double[] vet2, String opera) {
		double produto = 0;
		for (int i = 0; i < vet.length; i++) {
			if (opera.contentEquals("+")) {
				produto = vet[i] + vet2[i];
			} else if (opera.contentEquals("-")) {
				produto = vet[i] - vet2[i];
			} else if (opera.contentEquals("*")) {
				produto = vet[i] * vet2[i];
			} else if (opera.contentEquals("/")) {
				produto = vet[i] / vet2[i];
			}

		}
		return produto;
	}

}