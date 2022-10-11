package segundaFeira;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex3S extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex3S frame = new ex3S();
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
	public ex3S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBounds(110, 10, 96, 19);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		nota1 = new JTextField();
		nota1.setBounds(110, 53, 96, 19);
		contentPane.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setBounds(110, 80, 96, 19);
		contentPane.add(nota2);
		nota2.setColumns(10);
		
		nota3 = new JTextField();
		nota3.setBounds(110, 109, 96, 19);
		contentPane.add(nota3);
		nota3.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(55, 12, 45, 13);
		contentPane.add(lblNome);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota1.setBounds(55, 55, 45, 13);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNota2.setBounds(55, 84, 45, 13);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNota3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota3.setBounds(55, 111, 45, 13);
		contentPane.add(lblNota3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = textNome.getText();

				Double n1 = Double.valueOf(nota1.getText());
				Double n2 = Double.valueOf(nota2.getText());
				Double n3 = Double.valueOf(nota3.getText());
				
				JOptionPane.showMessageDialog(null, " Aluno: " + nome + "\n Media: " + Math. round(mediaMain(n1, n2, n3)) );

			}

			private Double mediaMain(Double n1, Double n2, Double n3) {
				
				Double media = 0.0;
				for (int i = 0; i < 3; i++) {
					media = (n1 + n2 + n3) / 3;
				}

				return media;
			}
				
			
		});
		btnCalcular.setForeground(new Color(204, 0, 0));
		btnCalcular.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnCalcular.setBounds(93, 154, 132, 38);
		contentPane.add(btnCalcular);
	}
}
