package grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Panel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class InscripcionAlumno extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscripcionAlumno frame = new InscripcionAlumno();
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
	public InscripcionAlumno() {
		setTitle("Inscripcion Alumno");
		getContentPane().setBackground(new Color(210, 180, 140));
		setBounds(100, 100, 298, 264);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cédula");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 29, 51, 24);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(80, 23, 194, 30);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(10, 54, 65, 30);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellido.setBounds(10, 85, 60, 28);
		getContentPane().add(lblApellido);
		
		JLabel lblDomicilio = new JLabel("Domicilio");
		lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDomicilio.setBounds(10, 117, 65, 24);
		getContentPane().add(lblDomicilio);
		
		JLabel lblTelfono = new JLabel("Teléfono");
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelfono.setBounds(10, 148, 65, 25);
		getContentPane().add(lblTelfono);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBackground(new Color(211, 211, 211));
		btnNewButton.setBounds(92, 188, 96, 23);
		getContentPane().add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(80, 54, 194, 30);
		getContentPane().add(textField_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 85, 194, 30);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 116, 194, 30);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 147, 194, 30);
		getContentPane().add(textField_4);

	}
}
