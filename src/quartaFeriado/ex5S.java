package quartaFeriado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ex5S extends JFrame {

	private JPanel contentPane;
	private JTextField valor;
	private JTextField textMaior;
	private JTextField textMenor;
	ArrayList<Double> valores = new ArrayList();
	private JTextField maior;
	private JTextField menor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex5S frame = new ex5S();
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
	public ex5S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		valor = new JTextField();
		valor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		valor.setBounds(273, 33, 127, 40);
		contentPane.add(valor);
		valor.setColumns(10);

		textMaior = new JTextField();
		textMaior.setEditable(false);
		textMaior.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMaior.setBounds(273, 110, 127, 42);
		contentPane.add(textMaior);
		textMaior.setColumns(10);

		textMenor = new JTextField();
		textMenor.setEditable(false);
		textMenor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMenor.setBounds(273, 194, 127, 42);
		contentPane.add(textMenor);
		textMenor.setColumns(10);

		JButton btncadastrar = new JButton("Casdastrar");
		btncadastrar.setForeground(new Color(255, 69, 0));
		btncadastrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				valores.add(Double.valueOf(valor.getText()));

			}
		});
		btncadastrar.setBounds(48, 55, 172, 49);
		contentPane.add(btncadastrar);

		JButton btnExibir = new JButton("Exibir");
		btnExibir.setForeground(new Color(0, 128, 0));
		btnExibir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double maior = Double.MIN_VALUE;
				Double menor = Double.MAX_VALUE;

				for (int i = 0; i < valores.size(); i++) {

					if (maior < valores.get(i)) {

						maior = valores.get(i);

						textMaior.setText(String.valueOf(maior));

					}

					if (menor > valores.get(i)) {

						menor = valores.get(i);

						textMenor.setText(String.valueOf(menor));
					}

				}
			}

		});
		btnExibir.setBounds(48, 143, 172, 49);
		contentPane.add(btnExibir);

		JLabel lblValor = new JLabel("Insira um numero:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValor.setHorizontalAlignment(SwingConstants.LEFT);
		lblValor.setBounds(273, 10, 157, 13);
		contentPane.add(lblValor);

		JLabel lblMaior = new JLabel("Maior valor:");
		lblMaior.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMaior.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaior.setBounds(273, 87, 117, 13);
		contentPane.add(lblMaior);

		JLabel lblMenor = new JLabel("Menor valor:");
		lblMenor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMenor.setHorizontalAlignment(SwingConstants.LEFT);
		lblMenor.setBounds(273, 168, 117, 13);
		contentPane.add(lblMenor);
	}
}
