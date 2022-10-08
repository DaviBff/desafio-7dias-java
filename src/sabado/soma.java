package sabado;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class soma extends JFrame {

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
					soma frame = new soma();
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
	public soma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		valor1 = new JTextField();
		valor1.setBounds(44, 56, 96, 19);
		contentPane.add(valor1);
		valor1.setColumns(10);
		
		valor2 = new JTextField();
		valor2.setBounds(44, 85, 96, 19);
		contentPane.add(valor2);
		valor2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Integer n1 = Integer.valueOf(valor1.getText());
				Integer n2 = Integer.valueOf(valor2.getText());
				
				JOptionPane.showMessageDialog(null,"soma ="+somaMain(n1,n2));;
				
			}

			private Integer somaMain(Integer n1, Integer n2) {
				Integer soma=0;
				soma=n1+n2;
				
				
				
				return soma;
			}

			
		});
		btnNewButton.setBounds(61, 166, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Insira um valor:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(42, 24, 120, 22);
		contentPane.add(lblNewLabel);
	}
}
