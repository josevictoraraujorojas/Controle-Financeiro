package Tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Cadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setResizable(false);
		setBackground(new Color(240, 240, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joaov\\Downloads\\imagem_de_fundo.jpeg"));
		
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 2, true));
		panel.setBackground(Color.CYAN);
		panel.setBounds(80, 11, 281, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setBounds(102, 11, 65, 22);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 53, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(21, 78, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Saldo:");
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(21, 131, 46, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Despesas:");
		lblNewLabel_1_1_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(21, 156, 65, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Renda Disponivel:");
		lblNewLabel_1_1_1_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lblNewLabel_1_1_1_2.setBounds(21, 106, 116, 14);
		panel.add(lblNewLabel_1_1_1_2);
		
		textField = new JTextField();
		textField.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField.setBounds(63, 51, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new EmptyBorder(0, 0, 0, 0));
		passwordField.setBounds(63, 76, 86, 20);
		panel.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_1.setBounds(131, 104, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_2.setBounds(63, 129, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(128, 128, 128), 0, true));
		textField_3.setBounds(81, 154, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setActionCommand("Cancelar");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setForeground(new Color(255, 245, 238));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setBounds(157, 205, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.setForeground(new Color(255, 245, 238));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_1.setBackground(new Color(34, 139, 34));
		btnNewButton_1.setBounds(38, 205, 89, 23);
		panel.add(btnNewButton_1);
		
		
	}
}
