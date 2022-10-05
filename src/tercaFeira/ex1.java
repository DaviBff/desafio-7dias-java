package tercaFeira;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		String vet[] = new String[3];
		for (int i = 0; i < vet.length; i++) {
			String nome = JOptionPane.showInputDialog("Insira o nome: ");
			vet[i] = nome;
		}
		JOptionPane.showMessageDialog(null, vet);
	}

}
