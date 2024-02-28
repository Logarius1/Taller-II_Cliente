package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistroResultadoAsignatura extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroResultadoAsignatura frame = new RegistroResultadoAsignatura();
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
	public RegistroResultadoAsignatura() {
		getContentPane().setBackground(new Color(210, 180, 140));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cédula");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 50, 31);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(69, 16, 169, 24);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota.setBounds(10, 39, 50, 31);
		getContentPane().add(lblNota);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(69, 44, 169, 24);
		getContentPane().add(textField_1);
		
		JLabel lblNmero = new JLabel("Número");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(10, 69, 50, 31);
		getContentPane().add(lblNmero);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(69, 74, 169, 24);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(79, 109, 89, 23);
		getContentPane().add(btnNewButton);
		setTitle("Registro de resultado de una asignatura");
		setBounds(100, 100, 257, 174);

	}

}
