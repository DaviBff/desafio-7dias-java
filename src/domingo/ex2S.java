package domingo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex2S extends JFrame {

	private JPanel contentPane;
	private JTextField valor1;
	private JTextField valor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex2S frame = new ex2S();
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
	public ex2S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		valor1 = new JTextField();
		valor1.setBounds(82, 49, 96, 19);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer n1 = Integer.valueOf(valor1.getText());
				Integer n2 = Integer.valueOf(valor2.getText());
				
				JOptionPane.showMessageDialog(null,"Resultado = "+somaMain(n1,n2));;
				
			}

			private Integer somaMain(Integer n1, Integer n2) {
				Integer soma=0;
				soma=n1+n2;
				
				
				
				return soma;
			}
				
				
				
				
			
		});
		btnSoma.setBounds(16, 153, 102, 21);
		contentPane.add(btnSoma);
		
		JButton btnMultiplicacao = new JButton("Multiplicação");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer n1 = Integer.valueOf(valor1.getText());
				Integer n2 = Integer.valueOf(valor2.getText());
				
				JOptionPane.showMessageDialog(null,"Resultado = "+multMain(n1,n2));;
				
			}

			private Integer multMain(Integer n1, Integer n2) {
				Integer mult=0;
				mult=n1*n2;
				
				
				
				return mult;
			}
			
		});
		btnMultiplicacao.setBounds(151, 153, 109, 21);
		contentPane.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("Divisão");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1 = Double.valueOf(valor1.getText());
				Double n2 = Double.valueOf(valor2.getText());
				
				JOptionPane.showMessageDialog(null,"Reultado = "+divMain(n1,n2));;
				
			}

			private Double divMain(Double n1, Double n2) {
				Double div;
				div=n1/n2;
				
				
				
				return div;
			
			}
		});
		btnDivisao.setBounds(16, 198, 102, 21);
		contentPane.add(btnDivisao);
		
		JButton btnSubtracao = new JButton("Subtração");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer n1 = Integer.valueOf(valor1.getText());
				Integer n2 = Integer.valueOf(valor2.getText());
				
				JOptionPane.showMessageDialog(null,"Resultado = "+subMain(n1,n2));;
				
			}

			private Integer subMain(Integer n1, Integer n2) {
				Integer sub=0;
				sub=n1-n2;
				
				
				
				return sub;
			
			}
		});
		btnSubtracao.setBounds(151, 198, 109, 21);
		contentPane.add(btnSubtracao);
		
		valor2 = new JTextField();
		valor2.setBounds(82, 98, 96, 19);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira um numero:");
		lblNewLabel.setBounds(82, 26, 121, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira outro numero:");
		lblNewLabel_1.setBounds(82, 75, 121, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Escolha a operação");
		lblNewLabel_2.setBounds(82, 127, 121, 13);
		contentPane.add(lblNewLabel_2);
	}
}
