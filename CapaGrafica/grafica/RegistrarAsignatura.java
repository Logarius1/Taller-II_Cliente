package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class RegistrarAsignatura extends JInternalFrame {

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
					RegistrarAsignatura frame = new RegistrarAsignatura();
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
	public RegistrarAsignatura() {
		getContentPane().setBackground(new Color(210, 180, 140));
		setTitle("Registrar Asignatura");
		setBounds(100, 100, 371, 224);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código alfanumérico");
		lblNewLabel.setBounds(10, 3, 128, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 37, 128, 26);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripción");
		lblDescripcion.setBounds(10, 64, 128, 26);
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDescripcion);
		
		textField = new JTextField();
		textField.setBounds(138, 9, 216, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 39, 216, 26);
		textField_1.setColumns(10);
		getContentPane().add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(138, 68, 216, 77);
		getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(138, 168, 89, 23);
		getContentPane().add(btnNewButton);

	}
}
