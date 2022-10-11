package tercaFeira2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ex4 extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField resultado;
	ArrayList<Double> myNumbers = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		valor = new JTextField();
		valor.setBounds(75, 33, 96, 19);
		contentPane.add(valor);
		valor.setColumns(10);

		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setBounds(75, 72, 96, 19);
		contentPane.add(resultado);
		resultado.setColumns(10);

		JLabel lblNewLabel = new JLabel("Insira um numero:");
		lblNewLabel.setBounds(75, 20, 111, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(75, 60, 88, 13);
		contentPane.add(lblNewLabel_1);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(new Color(0, 128, 0));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String x = valor.getText();
				Double par = Double.valueOf(x);
				myNumbers.add(par);

			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCadastrar.setBounds(26, 116, 96, 29);
		contentPane.add(btnCadastrar);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setForeground(new Color(220, 20, 60));
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer contador = 0;

				for (int i = 0; i < myNumbers.size(); i++) {
					if (myNumbers.get(i) % 2 == 0) {
						contador++;

						resultado.setText(String.valueOf(contador));
					}
				}
			}
		});
		btnExibir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnExibir.setBounds(152, 116, 96, 29);
		contentPane.add(btnExibir);
	}
}
