package quartaFeira;

import javax.swing.JOptionPane;

public class ex8V {

	public static void main(String[] args) {
		int vet[] = new int[3];
		Integer soma = 0;
		for (int i = 0; i < vet.length; i++) {
			String num = JOptionPane.showInputDialog("Insira um numero: ");
			Integer num1 = Integer.valueOf(num);
			vet[i] = num1;
			soma += vet[i];

		}
		JOptionPane.showMessageDialog(null, "Resultado da soma 5= "+soma);

	}

}
