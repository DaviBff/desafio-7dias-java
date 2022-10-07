package quartaFeira;

import javax.swing.JOptionPane;

public class ex8V {

	public static void main(String[] args) {
		int vet[] = new int[3];
		for (int i = 0; i < vet.length; i++) {
			vet[i]= Integer.valueOf(JOptionPane.showInputDialog("Insira um numero: "));
			

		}
		
		JOptionPane.showMessageDialog(null, "Resultado da soma = "+somaMain(vet));

	}

	private static Integer somaMain(int[] vet) {
		Integer soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		
		return soma;
	}

}
