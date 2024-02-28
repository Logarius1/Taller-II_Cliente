package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InscripcionAsignaturaTrue extends JInternalFrame {

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
					InscripcionAsignaturaTrue frame = new InscripcionAsignaturaTrue();
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
	public InscripcionAsignaturaTrue() {
		getContentPane().setBackground(new Color(210, 180, 140));
		setTitle("Inscripcion Asignatura");
		setBounds(100, 100, 329, 153);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Año lectivo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 92, 25);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 13, 199, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMonto.setBounds(10, 39, 92, 25);
		getContentPane().add(lblMonto);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 41, 199, 25);
		getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(111, 77, 89, 23);
		getContentPane().add(btnNewButton);

	}

}
