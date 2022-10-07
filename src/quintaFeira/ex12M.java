package quintaFeira;

import javax.swing.JOptionPane;

public class ex12M {

	public static void main(String[] args) {
		Integer xx = Integer.valueOf(JOptionPane.showInputDialog("Insira o tamanho do vetor: "));
		Integer[] vet = new Integer[xx];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.valueOf(JOptionPane.showInputDialog("Insira um numero: "));
		}

		JOptionPane.showMessageDialog(null, "Resultado = " + somaTotal(vet));
	}

	private static Integer somaTotal(Integer[] vet) {
		Integer soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}
}