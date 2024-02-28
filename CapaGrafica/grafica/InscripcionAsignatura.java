package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InscripcionAsignatura extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscripcionAsignatura frame = new InscripcionAsignatura();
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
	public InscripcionAsignatura() {
		setTitle("Inscripcion Asignatura");
		getContentPane().setBackground(new Color(210, 180, 140));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 55, 25);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(75, 11, 174, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCdula = new JLabel("Cédula");
		lblCdula.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdula.setBounds(10, 39, 55, 25);
		getContentPane().add(lblCdula);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 39, 174, 25);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(85, 75, 89, 23);
		getContentPane().add(btnNewButton);
		setBounds(100, 100, 265, 138);

	}

}
